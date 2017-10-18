package io.github.fyggh.zoo.animals;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.image.BufferedImage;

public class Dragon {
	private int x,y;
	private String name;
	private double scale = 2;
	
	public Dragon(int x, int y, double size, String name) {
		this.x = x;
		this.y = y;
		this.scale = size;
		this.name = name;
	}
	public Dragon(int x, int y, double size) {
		this(x, y, size, null);
	}
	public Dragon(int x, int y, String name) {
		this(x, y, 2, name);
	}
	public Dragon(int x, int y) {
		this(x,y,2);
	}
	
	
	public String getName() {
		return name;
	}
	
	private TexturePaint getScales() {
		int xd = adjustXScale(10);
		int yd = adjustYScale(10);
		BufferedImage scale = new BufferedImage(xd,yd,BufferedImage.TYPE_INT_ARGB);
		Graphics2D g = (Graphics2D) scale.getGraphics();
		Arc2D.Double sc1 = new Arc2D.Double(-(int)(xd * 0.5), -(int)(yd * 0.5), xd, yd, 270, 90, Arc2D.OPEN);
		Arc2D.Double sc2 = new Arc2D.Double((int)(xd * 0.5), -(int)(yd * 0.5), xd, yd, 180, 90, Arc2D.OPEN);
		Arc2D.Double sc3 = new Arc2D.Double(0, 0, xd, yd, 180, 180, Arc2D.OPEN);
		Rectangle backgrnd = new Rectangle(0,0,xd,yd);
		
		Color green = new Color(46, 107, 43);
		g.setPaint(green);
		g.fill(backgrnd);
		
		//g.setStroke(new BasicStroke(3));
		g.setPaint(Color.BLACK);
		g.draw(sc1);
		g.draw(sc2);
		g.draw(sc3);
		
		return new TexturePaint(scale, backgrnd);
		
	}
	
	private int adjustX(double x) {
		return((int)((this.x+x)*scale));
	}
	private int adjustY(double y) {
		return((int)((this.y+y)*scale));
	}
	private int adjustXScale(double x) {
		return((int)(x*scale));
	}
	private int adjustYScale(double y) {
		return((int)(y*scale));
	}
	
	
	public void paint(Graphics2D g) {
		Path2D.Double dg = new Path2D.Double();
		Path2D.Double tooth = new Path2D.Double();
		
		Color green = new Color(46, 107, 43);
		g.setPaint(green);
		
		dg.moveTo(adjustX(47.897186), adjustY(372.08874));
		dg.curveTo(adjustX(48.644028), adjustY(368.94254), adjustX(54.441559), adjustY(340.00731), adjustX(54.441559), adjustY(339.42605));
		dg.curveTo(adjustX(54.441559), adjustY(339.17962), adjustX(58.031312), adjustY(339.29575), adjustX(62.418787), adjustY(339.68413));
		dg.curveTo(adjustX(70.291548), adjustY(340.38103), adjustX(70.447261), adjustY(340.34969), adjustX(74.309241), adjustY(337.29095));
		dg.curveTo(adjustX(87.5192), adjustY(326.82847), adjustX(111.79785), adjustY(320.35027), adjustX(151.626), adjustY(316.66076));
		dg.curveTo(adjustX(195.19834), adjustY(312.6244), adjustX(216.47748), adjustY(306.38534), adjustX(223.89336), adjustY(295.4719));
		dg.curveTo(adjustX(227.51527), adjustY(290.14178), adjustX(227.29072), adjustY(285.45495), adjustX(223.15357), adjustY(280.03079));
		dg.curveTo(adjustX(215.00522), adjustY(269.34758), adjustX(193.93451), adjustY(264.99492), adjustX(174.77495), adjustY(270.037));
		dg.curveTo(adjustX(169.86547), adjustY(271.32899), adjustX(163.58381), adjustY(272.18615), adjustX(159.02495), adjustY(272.18615));
		dg.curveTo(adjustX(154.85408), adjustY(272.18615), adjustX(151.44156), adjustY(272.56463), adjustX(151.44156), adjustY(273.02722));
		dg.curveTo(adjustX(151.44156), adjustY(273.48981), adjustX(152.10475), adjustY(276.07191), adjustX(152.91532), adjustY(278.76522));
		dg.curveTo(adjustX(154.33493), adjustY(283.48222), adjustX(154.04546), adjustY(291.18615), adjustX(152.44861), adjustY(291.18615));
		dg.curveTo(adjustX(152.04308), adjustY(291.18615), adjustX(150.50208), adjustY(290.23499), adjustX(149.02417), adjustY(289.07247));
		dg.curveTo(adjustX(147.06216), adjustY(287.52915), adjustX(144.79955), adjustY(286.9275), adjustX(140.63931), adjustY(286.84286));
		dg.curveTo(adjustX(135.5806), adjustY(286.73993), adjustX(133.31708), adjustY(287.48374), adjustX(120.45749), adjustY(293.47468));
		dg.curveTo(adjustX(109.41614), adjustY(298.61856), adjustX(104.84062), adjustY(301.3382), adjustX(101.20749), adjustY(304.9167));
		dg.lineTo(adjustX(96.441559), adjustY(309.61097));
		dg.lineTo(adjustX(96.441559), adjustY(303.82124));
		dg.lineTo(adjustX(96.441559), adjustY(298.0315));
		dg.lineTo(adjustX(90.941559), adjustY(302.7303));
		dg.curveTo(adjustX(85.039133), adjustY(307.7729), adjustX(84.713564), adjustY(307.50995), adjustX(86.862915), adjustY(299.43615));
		dg.curveTo(adjustX(88.488639), adjustY(293.3293), adjustX(87.821439), adjustY(292.88362), adjustX(81.971975), adjustY(296.16907));
		dg.curveTo(adjustX(80.030246), adjustY(297.25967), adjustX(78.441559), adjustY(297.92344), adjustX(78.441559), adjustY(297.6441));
		dg.curveTo(adjustX(78.441559), adjustY(297.36477), adjustX(80.00123), adjustY(294.03913), adjustX(81.907495), adjustY(290.25379));
		dg.lineTo(adjustX(85.373431), adjustY(283.37136));
		dg.lineTo(adjustX(94.157495), adjustY(282.67226));
		dg.curveTo(adjustX(106.77575), adjustY(281.66801), adjustX(124.5519), adjustY(277.33397), adjustX(124.39382), adjustY(275.30029));
		dg.curveTo(adjustX(124.36757), adjustY(274.96251), adjustX(119.11723), adjustY(271.07275), adjustX(112.72641), adjustY(266.65638));
		dg.curveTo(adjustX(97.376312), adjustY(256.0487), adjustX(95.010812), adjustY(251.4545), adjustX(97.756024), adjustY(237.58141));
		dg.lineTo(adjustX(98.56827), adjustY(233.47668));
		dg.lineTo(adjustX(92.254915), adjustY(228.77909));
		dg.lineTo(adjustX(85.941559), adjustY(224.0815));
		dg.lineTo(adjustX(85.336639), adjustY(230.21106));
		dg.curveTo(adjustX(84.886464), adjustY(234.77262), adjustX(83.615286), adjustY(238.43129), adjustX(80.367402), adjustY(244.51338));
		dg.curveTo(adjustX(76.076493), adjustY(252.54868), adjustX(76.002567), adjustY(252.85145), adjustX(75.972322), adjustY(262.51373));
		dg.lineTo(adjustX(75.941559), adjustY(272.34131));
		dg.lineTo(adjustX(72.191559), adjustY(271.9873));
		dg.lineTo(adjustX(68.441559), adjustY(271.6333));
		dg.lineTo(adjustX(68.441559), adjustY(275.72973));
		dg.curveTo(adjustX(68.441559), adjustY(278.96461), adjustX(69.176505), adjustY(280.68477), adjustX(71.936053), adjustY(283.90868));
		dg.curveTo(adjustX(74.849955), adjustY(287.31292), adjustX(75.326929), adjustY(288.5093), adjustX(74.806891), adjustY(291.10949));
		dg.curveTo(adjustX(73.929514), adjustY(295.49638), adjustX(72.933029), adjustY(295.6843), adjustX(70.691721), adjustY(291.88557));
		dg.curveTo(adjustX(68.978855), adjustY(288.98248), adjustX(67.974269), adjustY(288.44575), adjustX(62.294704), adjustY(287.39925));
		dg.curveTo(adjustX(57.635111), adjustY(286.54069), adjustX(54.884882), adjustY(286.50505), adjustX(52.39244), adjustY(287.27094));
		dg.curveTo(adjustX(50.494455), adjustY(287.85416), adjustX(44.290934), adjustY(288.69735), adjustX(38.606837), adjustY(289.1447));
		dg.curveTo(adjustX(28.721577), adjustY(289.92268), adjustX(28.119002), adjustY(290.10435), adjustX(24.751507), adjustY(293.3221));
		dg.lineTo(adjustX(21.230899), adjustY(296.68615));
		dg.lineTo(adjustX(21.959867), adjustY(292.22461));
		dg.curveTo(adjustX(23.426922), adjustY(283.24571), adjustX(27.341795), adjustY(280.48889), adjustX(40.568685), adjustY(279.12045));
		dg.curveTo(adjustX(48.074768), adjustY(278.34388), adjustX(50.412263), adjustY(277.68314), adjustX(53.214377), adjustY(275.54586));
		dg.curveTo(adjustX(61.885484), adjustY(268.93208), adjustX(64.983981), adjustY(258.52498), adjustX(64.188586), adjustY(238.68615));
		dg.curveTo(adjustX(63.585165), adjustY(223.63556), adjustX(60.482825), adjustY(213.16577), adjustX(53.896444), adjustY(203.9522));
		dg.curveTo(adjustX(46.371043), adjustY(193.42505), adjustX(44.663217), adjustY(188.95881), adjustX(43.432295), adjustY(176.58681));
		dg.curveTo(adjustX(41.949675), adjustY(161.685), adjustX(43.19366), adjustY(156.59317), adjustX(52.984865), adjustY(137.48661));
		dg.curveTo(adjustX(59.306597), adjustY(125.15038), adjustX(60.68419), adjustY(121.60192), adjustX(61.151223), adjustY(116.45141));
		dg.curveTo(adjustX(61.80048), adjustY(109.29128), adjustX(60.50891), adjustY(105.26205), adjustX(56.476949), adjustY(101.86938));
		dg.curveTo(adjustX(52.082788), adjustY(98.171939), adjustX(33.729909), adjustY(91.404159), adjustX(23.388354), adjustY(89.667682));
		dg.curveTo(adjustX(11.496153), adjustY(87.670832), adjustX(8.1346848), adjustY(86.609526), adjustX(5.9074902), adjustY(84.148504));
		dg.curveTo(adjustX(4.1758133), adjustY(82.235022), adjustX(4.2163863), adjustY(82.18665), adjustX(7.536571), adjustY(82.206256));
		dg.curveTo(adjustX(9.4093142), adjustY(82.217315), adjustX(13.853939), adjustY(82.647254), adjustX(17.413515), adjustY(83.161676));
		dg.curveTo(adjustX(22.449083), adjustY(83.889406), adjustX(25.278822), adjustY(83.746992), adjustX(30.163515), adjustY(82.519996));
		dg.curveTo(adjustX(33.616439), adjustY(81.652649), adjustX(36.441559), adjustY(80.515342), adjustX(36.441559), adjustY(79.992646));
		dg.curveTo(adjustX(36.441559), adjustY(76.16138), adjustX(27.015531), adjustY(65.199539), adjustX(20.603264), adjustY(61.573765));
		dg.lineTo(adjustX(17.264969), adjustY(59.686149));
		//Tooth
		tooth.moveTo(adjustX(17.264969), adjustY(59.686149));
		tooth.lineTo(adjustX(13.748153), adjustY(63.686149));
		tooth.curveTo(adjustX(11.813904), adjustY(65.886149), adjustX(10.477251), adjustY(66.930605), adjustX(10.777812), adjustY(66.007163));
		tooth.curveTo(adjustX(11.078374), adjustY(65.08372), adjustX(11.614929), adjustY(62.778926), adjustX(11.970157), adjustY(60.885398));
		tooth.curveTo(adjustX(12.574269), adjustY(57.665206), adjustX(12.400263), adjustY(57.366355), adjustX(9.2787925), adjustY(56.263034));
		
		dg.curveTo(adjustX(12.574269), adjustY(57.665206), adjustX(12.400263), adjustY(57.366355), adjustX(9.2787925), adjustY(56.263034));
		dg.curveTo(adjustX(5.4704276), adjustY(54.916922), adjustX(5.8515634), adjustY(54.558192), adjustX(14.202614), adjustY(51.628671));
		dg.lineTo(adjustX(19.463668), adjustY(49.78311));
		dg.lineTo(adjustX(24.202614), adjustY(54.438519));
		dg.curveTo(adjustX(31.05875), adjustY(61.173798), adjustX(34.58667), adjustY(62.353326), adjustX(46.78647), adjustY(61.989226));
		dg.lineTo(adjustX(56.941559), adjustY(61.686149));
		dg.lineTo(adjustX(64.441559), adjustY(66.515789));
		dg.curveTo(adjustX(71.286327), adjustY(70.923492), adjustX(72.360623), adjustY(71.307222), adjustX(76.738311), adjustY(70.90809));
		dg.curveTo(adjustX(82.680895), adjustY(70.366279), adjustX(87.020901), adjustY(66.635478), adjustX(87.923516), adjustY(61.292946));
		dg.curveTo(adjustX(88.989218), adjustY(54.985106), adjustX(89.85455), adjustY(54.852009), adjustX(92.740723), adjustY(60.552005));
		dg.curveTo(adjustX(96.186892), adjustY(67.357957), adjustX(96.134697), adjustY(69.479613), adjustX(92.333982), adjustY(77.085516));
		dg.curveTo(adjustX(90.624815), adjustY(80.505863), adjustX(89.387315), adjustY(83.447424), adjustX(89.583982), adjustY(83.622319));
		dg.curveTo(adjustX(89.780649), adjustY(83.797214), adjustX(91.96021), adjustY(84.958923), adjustX(94.427449), adjustY(86.203895));
		dg.curveTo(adjustX(99.607249), adjustY(88.817629), adjustX(99.331856), adjustY(89.039479), adjustX(88.191559), adjustY(91.227391));
		dg.curveTo(adjustX(80.63181), adjustY(92.712098), adjustX(80.427053), adjustY(93.069718), adjustX(82.99103), adjustY(100.31042));
		dg.curveTo(adjustX(83.84324), adjustY(102.71707), adjustX(85.439019), adjustY(111.43615), adjustX(86.537207), adjustY(119.68615));
		dg.curveTo(adjustX(88.052865), adjustY(131.07234), adjustX(89.167271), adjustY(135.95649), adjustX(91.162824), adjustY(139.95902));
		dg.curveTo(adjustX(95.156403), adjustY(147.96902), adjustX(95.678573), adjustY(148.09256), adjustX(100.3834), adjustY(142.14051));
		dg.curveTo(adjustX(109.8522), adjustY(130.16158), adjustX(115.22405), adjustY(112.79119), adjustX(114.11936), adjustY(97.723984));
		dg.curveTo(adjustX(113.07836), adjustY(83.525411), adjustX(108.29276), adjustY(71.673881), adjustX(98.912411), adjustY(60.064009));
		dg.lineTo(adjustX(93.477853), adjustY(53.337762));
		dg.lineTo(adjustX(95.086326), adjustY(44.511955));
		dg.curveTo(adjustX(97.294468), adjustY(32.395724), adjustX(97.848605), adjustY(31.637032), adjustX(100.3048), adjustY(37.367109));
		dg.curveTo(adjustX(103.84071), adjustY(45.616047), adjustX(106.70883), adjustY(45.950955), adjustX(119.02362), adjustY(39.552898));
		dg.curveTo(adjustX(154.8176), adjustY(20.956398), adjustX(181.71518), adjustY(12.58983), adjustX(231.44156), adjustY(4.5849724));
		dg.curveTo(adjustX(243.44158), adjustY(2.6532323), adjustX(251.90927), adjustY(1.9923215), adjustX(268.94156), adjustY(1.6580645));
		dg.curveTo(adjustX(284.60632), adjustY(1.350645), adjustX(289.82944), adjustY(1.5106989), adjustX(287.07957), adjustY(2.2138744));
		dg.curveTo(adjustX(281.41886), adjustY(3.6613837), adjustX(268.79031), adjustY(10.498902), adjustX(262.19975), adjustY(15.684636));
		dg.curveTo(adjustX(254.03126), adjustY(22.111949), adjustX(247.80036), adjustY(30.423542), adjustX(245.33117), adjustY(38.186149));
		dg.curveTo(adjustX(244.19401), adjustY(41.761149), adjustX(242.7891), adjustY(50.029588), adjustX(242.20914), adjustY(56.560459));
		dg.curveTo(adjustX(241.30001), adjustY(66.798248), adjustX(241.38118), adjustY(69.153306), adjustX(242.79812), adjustY(73.648351));
		dg.curveTo(adjustX(243.70201), adjustY(76.515821), adjustX(244.44156), adjustY(80.877971), adjustX(244.44156), adjustY(83.342017));
		dg.lineTo(adjustX(244.44156), adjustY(87.8221));
		dg.lineTo(adjustX(236.01634), adjustY(88.949383));
		dg.curveTo(adjustX(225.90345), adjustY(90.302475), adjustX(219.45634), adjustY(93.329261), adjustX(213.05753), adjustY(99.728079));
		dg.curveTo(adjustX(205.64791), adjustY(107.13769), adjustX(199.31106), adjustY(119.79076), adjustX(194.54833), adjustY(136.68615));
		dg.curveTo(adjustX(193.308), adjustY(141.08615), adjustX(192.12329), adjustY(145.22883), adjustX(191.91565), adjustY(145.89211));
		dg.curveTo(adjustX(191.64386), adjustY(146.76033), adjustX(189.57897), adjustY(146.41358), adjustX(184.54266), adjustY(144.654));
		dg.curveTo(adjustX(180.69515), adjustY(143.30976), adjustX(174.47404), adjustY(141.92431), adjustX(170.71798), adjustY(141.57522));
		dg.lineTo(adjustX(163.88877), adjustY(140.94051));
		dg.lineTo(adjustX(157.22749), adjustY(145.59708));
		dg.curveTo(adjustX(149.21991), adjustY(151.19477), adjustX(141.93973), adjustY(159.05322), adjustX(139.07986), adjustY(165.18615));
		dg.curveTo(adjustX(137.92574), adjustY(167.66115), adjustX(136.87615), adjustY(169.85748), adjustX(136.74745), adjustY(170.06688));
		dg.curveTo(adjustX(136.61874), adjustY(170.27628), adjustX(134.13476), adjustY(169.49483), adjustX(131.2275), adjustY(168.33031));
		dg.curveTo(adjustX(128.32023), adjustY(167.1658), adjustX(122.22906), adjustY(165.1495), adjustX(117.69156), adjustY(163.84964));
		dg.lineTo(adjustX(109.44156), adjustY(161.48626));
		dg.lineTo(adjustX(109.44156), adjustY(166.17648));
		dg.curveTo(adjustX(109.44156), adjustY(172.44422), adjustX(114.13281), adjustY(181.72507), adjustX(120.06501), adjustY(187.19317));
		dg.curveTo(adjustX(125.66207), adjustY(192.35237), adjustX(135.14855), adjustY(196.81457), adjustX(150.94156), adjustY(201.71674));
		dg.curveTo(adjustX(166.5997), adjustY(206.57704), adjustX(173.39248), adjustY(210.20227), adjustX(188.88344), adjustY(221.96587));
		dg.curveTo(adjustX(205.1302), adjustY(234.30342), adjustX(219.35456), adjustY(243.56375), adjustX(236.44156), adjustY(252.92711));
		dg.curveTo(adjustX(258.20101), adjustY(264.85089), adjustX(264.87148), adjustY(273.11906), adjustX(264.88732), adjustY(288.18615));
		dg.curveTo(adjustX(264.89584), adjustY(296.29117), adjustX(263.15804), adjustY(300.89558), adjustX(257.26286), adjustY(308.38766));
		dg.curveTo(adjustX(249.33978), adjustY(318.45697), adjustX(228.35721), adjustY(326.73104), adjustX(200.58107), adjustY(330.73903));
		dg.curveTo(adjustX(186.74185), adjustY(332.73597), adjustX(177.2099), adjustY(333.30465), adjustX(143.94156), adjustY(334.11814));
		dg.lineTo(adjustX(103.94156), adjustY(335.09623));
		dg.lineTo(adjustX(92.441559), adjustY(338.75169));
		dg.curveTo(adjustX(82.338518), adjustY(341.96311), adjustX(76.010312), adjustY(344.47007), adjustX(74.464985), adjustY(345.87323));
		dg.curveTo(adjustX(74.20287), adjustY(346.11124), adjustX(75.733428), adjustY(347.77099), adjustX(77.866226), adjustY(349.56159));
		dg.lineTo(adjustX(81.74404), adjustY(352.81721));
		dg.lineTo(adjustX(66.8428), adjustY(362.14442));
		dg.curveTo(adjustX(58.647117), adjustY(367.27438), adjustX(50.903252), adjustY(372.15106), adjustX(49.63421), adjustY(372.98147));
		dg.curveTo(adjustX(47.42164), adjustY(374.4293), adjustX(47.350289), adjustY(374.39263), adjustX(47.897186), adjustY(372.08874));
		
		g.setPaint(Color.white);
		g.fill(tooth);
		g.setPaint(Color.BLACK);
		g.draw(tooth);
		g.setPaint(getScales());
		g.fill(dg);
		
		g.setPaint(Color.black);
		g.draw(dg);
		
		Ellipse2D.Double scalera = new Ellipse2D.Double(adjustX(46),adjustY(68),adjustXScale(10),adjustYScale(5));
		g.setPaint(Color.red);
		g.fill(scalera);
		
		Ellipse2D.Double pupil = new Ellipse2D.Double(adjustX(50),adjustY(68),adjustXScale(2),adjustYScale(5));
		g.setPaint(Color.black);
		g.fill(pupil);
		
	}

}
