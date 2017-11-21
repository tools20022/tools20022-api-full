/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.BenchmarkCurveName2Choice;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.entity.Curve;
import com.tools20022.repository.entity.SecuritiesIdentification;
import com.tools20022.repository.entity.Spread;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identifies the benchmark against which the financial instrument is measured.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BenchmarkCurve2#mmSpread
 * BenchmarkCurve2.mmSpread}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve2#mmBenchmarkIdentification
 * BenchmarkCurve2.mmBenchmarkIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve2#mmBenchmarkPrice
 * BenchmarkCurve2.mmBenchmarkPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve2#mmBenchmarkCurveCurrency
 * BenchmarkCurve2.mmBenchmarkCurveCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve2#mmBenchmarkCurveName
 * BenchmarkCurve2.mmBenchmarkCurveName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve2#mmBenchmarkCurvePoint
 * BenchmarkCurve2.mmBenchmarkCurvePoint}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Curve Curve}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BenchmarkCurve2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the benchmark against which the financial instrument is measured."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "BenchmarkCurve2", propOrder = {"spread", "benchmarkIdentification", "benchmarkPrice", "benchmarkCurveCurrency", "benchmarkCurveName", "benchmarkCurvePoint"})
public class BenchmarkCurve2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected DecimalNumber spread;
	/**
	 * Either a swap spread or spread to benchmark depending upon order type. In
	 * case of a spread to benchmark, the price offset is expressed in terms of
	 * basis points relative to a benchmark - this can be a positive or a
	 * negative spread. In case of a swap spread, the price offset is a target
	 * spread for a swap.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Curve#mmSpread
	 * Curve.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve2
	 * BenchmarkCurve2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sprd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Spread"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either a swap spread or spread to benchmark depending upon order type.  In case of a spread to benchmark, the price offset is expressed in terms of basis points relative to a benchmark - this can be a positive or a negative spread. In case of a swap spread, the price offset is a target spread for a swap."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSpread = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Curve.mmSpread;
			componentContext_lazy = () -> BenchmarkCurve2.mmObject();
			isDerived = false;
			xmlTag = "Sprd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Spread";
			definition = "Either a swap spread or spread to benchmark depending upon order type.  In case of a spread to benchmark, the price offset is expressed in terms of basis points relative to a benchmark - this can be a positive or a negative spread. In case of a swap spread, the price offset is a target spread for a swap.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected SecurityIdentification14 benchmarkIdentification;
	/**
	 * Identification of a security by an ISIN.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14
	 * SecurityIdentification14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmSecurityIdentification
	 * SecuritiesIdentification.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve2
	 * BenchmarkCurve2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BchmkId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BenchmarkIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a security by an ISIN."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBenchmarkIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmSecurityIdentification;
			componentContext_lazy = () -> BenchmarkCurve2.mmObject();
			isDerived = false;
			xmlTag = "BchmkId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BenchmarkIdentification";
			definition = "Identification of a security by an ISIN.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecurityIdentification14.mmObject();
		}
	};
	protected Price1 benchmarkPrice;
	/**
	 * Identifies the price of the benchmark security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price1 Price1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Spread#mmBenchmarkPrice
	 * Spread.mmBenchmarkPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve2
	 * BenchmarkCurve2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BchmkPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BenchmarkPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the price of the benchmark security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBenchmarkPrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Spread.mmBenchmarkPrice;
			componentContext_lazy = () -> BenchmarkCurve2.mmObject();
			isDerived = false;
			xmlTag = "BchmkPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BenchmarkPrice";
			definition = "Identifies the price of the benchmark security.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Price1.mmObject();
		}
	};
	protected CurrencyCode benchmarkCurveCurrency;
	/**
	 * Identifies the currency used for the benchmark curve.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Curve#mmCurrency
	 * Curve.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve2
	 * BenchmarkCurve2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BchmkCrvCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BenchmarkCurveCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the currency used for the benchmark curve."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBenchmarkCurveCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Curve.mmCurrency;
			componentContext_lazy = () -> BenchmarkCurve2.mmObject();
			isDerived = false;
			xmlTag = "BchmkCrvCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BenchmarkCurveCurrency";
			definition = "Identifies the currency used for the benchmark curve.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	protected BenchmarkCurveName2Choice benchmarkCurveName;
	/**
	 * Identifies the name of the benchmark curve.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName2Choice
	 * BenchmarkCurveName2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Curve#mmName Curve.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve2
	 * BenchmarkCurve2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BchmkCrvNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BenchmarkCurveName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the name of the benchmark curve."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBenchmarkCurveName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Curve.mmName;
			componentContext_lazy = () -> BenchmarkCurve2.mmObject();
			isDerived = false;
			xmlTag = "BchmkCrvNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BenchmarkCurveName";
			definition = "Identifies the name of the benchmark curve.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BenchmarkCurveName2Choice.mmObject();
		}
	};
	protected Max256Text benchmarkCurvePoint;
	/**
	 * Identifies a point on a benchmark curve. The point can be stated via a
	 * combination of maturity month/year and coupon.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Curve#mmPoint Curve.mmPoint}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve2
	 * BenchmarkCurve2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BchmkCrvPt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BenchmarkCurvePoint"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a point on a benchmark curve. The point can be stated via a combination of maturity month/year and coupon."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBenchmarkCurvePoint = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Curve.mmPoint;
			componentContext_lazy = () -> BenchmarkCurve2.mmObject();
			isDerived = false;
			xmlTag = "BchmkCrvPt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BenchmarkCurvePoint";
			definition = "Identifies a point on a benchmark curve. The point can be stated via a combination of maturity month/year and coupon.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(BenchmarkCurve2.mmSpread, BenchmarkCurve2.mmBenchmarkIdentification, BenchmarkCurve2.mmBenchmarkPrice, BenchmarkCurve2.mmBenchmarkCurveCurrency,
						BenchmarkCurve2.mmBenchmarkCurveName, BenchmarkCurve2.mmBenchmarkCurvePoint);
				trace_lazy = () -> Curve.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "BenchmarkCurve2";
				definition = "Identifies the benchmark against which the financial instrument is measured.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Sprd")
	public DecimalNumber getSpread() {
		return spread;
	}

	public void setSpread(DecimalNumber spread) {
		this.spread = spread;
	}

	@XmlElement(name = "BchmkId")
	public SecurityIdentification14 getBenchmarkIdentification() {
		return benchmarkIdentification;
	}

	public void setBenchmarkIdentification(com.tools20022.repository.msg.SecurityIdentification14 benchmarkIdentification) {
		this.benchmarkIdentification = benchmarkIdentification;
	}

	@XmlElement(name = "BchmkPric")
	public Price1 getBenchmarkPrice() {
		return benchmarkPrice;
	}

	public void setBenchmarkPrice(com.tools20022.repository.msg.Price1 benchmarkPrice) {
		this.benchmarkPrice = benchmarkPrice;
	}

	@XmlElement(name = "BchmkCrvCcy")
	public CurrencyCode getBenchmarkCurveCurrency() {
		return benchmarkCurveCurrency;
	}

	public void setBenchmarkCurveCurrency(CurrencyCode benchmarkCurveCurrency) {
		this.benchmarkCurveCurrency = benchmarkCurveCurrency;
	}

	@XmlElement(name = "BchmkCrvNm")
	public BenchmarkCurveName2Choice getBenchmarkCurveName() {
		return benchmarkCurveName;
	}

	public void setBenchmarkCurveName(BenchmarkCurveName2Choice benchmarkCurveName) {
		this.benchmarkCurveName = benchmarkCurveName;
	}

	@XmlElement(name = "BchmkCrvPt")
	public Max256Text getBenchmarkCurvePoint() {
		return benchmarkCurvePoint;
	}

	public void setBenchmarkCurvePoint(Max256Text benchmarkCurvePoint) {
		this.benchmarkCurvePoint = benchmarkCurvePoint;
	}
}