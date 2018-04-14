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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.BenchmarkCurveName7Choice;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.entity.Curve;
import com.tools20022.repository.entity.SecuritiesIdentification;
import com.tools20022.repository.entity.Spread;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Price1;
import com.tools20022.repository.msg.SecurityIdentification19;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
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
 * <li>{@linkplain com.tools20022.repository.msg.BenchmarkCurve4#mmSpread
 * BenchmarkCurve4.mmSpread}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve4#mmBenchmarkIdentification
 * BenchmarkCurve4.mmBenchmarkIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve4#mmBenchmarkPrice
 * BenchmarkCurve4.mmBenchmarkPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve4#mmBenchmarkCurveCurrency
 * BenchmarkCurve4.mmBenchmarkCurveCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve4#mmBenchmarkCurveName
 * BenchmarkCurve4.mmBenchmarkCurveName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve4#mmBenchmarkCurvePoint
 * BenchmarkCurve4.mmBenchmarkCurvePoint}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Curve Curve}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BenchmarkCurve4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the benchmark against which the financial instrument is measured."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BenchmarkCurve4", propOrder = {"spread", "benchmarkIdentification", "benchmarkPrice", "benchmarkCurveCurrency", "benchmarkCurveName", "benchmarkCurvePoint"})
public class BenchmarkCurve4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Sprd")
	protected DecimalNumber spread;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve4
	 * BenchmarkCurve4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sprd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Spread"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either a swap spread or spread to benchmark depending upon order type. In case of a spread to benchmark, the price offset is expressed in terms of basis points relative to a benchmark - this can be a positive or a negative spread. In case of a swap spread, the price offset is a target spread for a swap."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 218</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BenchmarkCurve4, Optional<DecimalNumber>> mmSpread = new MMMessageAttribute<BenchmarkCurve4, Optional<DecimalNumber>>() {
		{
			businessElementTrace_lazy = () -> Curve.mmSpread;
			componentContext_lazy = () -> com.tools20022.repository.msg.BenchmarkCurve4.mmObject();
			isDerived = false;
			xmlTag = "Sprd";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "218"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Spread";
			definition = "Either a swap spread or spread to benchmark depending upon order type. In case of a spread to benchmark, the price offset is expressed in terms of basis points relative to a benchmark - this can be a positive or a negative spread. In case of a swap spread, the price offset is a target spread for a swap.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(BenchmarkCurve4 obj) {
			return obj.getSpread();
		}

		@Override
		public void setValue(BenchmarkCurve4 obj, Optional<DecimalNumber> value) {
			obj.setSpread(value.orElse(null));
		}
	};
	@XmlElement(name = "BchmkId")
	protected SecurityIdentification19 benchmarkIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19
	 * SecurityIdentification19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmSecurityIdentification
	 * SecuritiesIdentification.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve4
	 * BenchmarkCurve4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BchmkId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BenchmarkIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a security by an ISIN."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BenchmarkCurve4, Optional<SecurityIdentification19>> mmBenchmarkIdentification = new MMMessageAssociationEnd<BenchmarkCurve4, Optional<SecurityIdentification19>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmSecurityIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.BenchmarkCurve4.mmObject();
			isDerived = false;
			xmlTag = "BchmkId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BenchmarkIdentification";
			definition = "Identification of a security by an ISIN.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecurityIdentification19.mmObject();
		}

		@Override
		public Optional<SecurityIdentification19> getValue(BenchmarkCurve4 obj) {
			return obj.getBenchmarkIdentification();
		}

		@Override
		public void setValue(BenchmarkCurve4 obj, Optional<SecurityIdentification19> value) {
			obj.setBenchmarkIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "BchmkPric")
	protected Price1 benchmarkPrice;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve4
	 * BenchmarkCurve4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BchmkPric"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BenchmarkPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the price of the benchmark security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 662, FIXSynonym: 663</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BenchmarkCurve4, Optional<Price1>> mmBenchmarkPrice = new MMMessageAttribute<BenchmarkCurve4, Optional<Price1>>() {
		{
			businessElementTrace_lazy = () -> Spread.mmBenchmarkPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.BenchmarkCurve4.mmObject();
			isDerived = false;
			xmlTag = "BchmkPric";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "662"), new FIXSynonym(this, "663"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BenchmarkPrice";
			definition = "Identifies the price of the benchmark security.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Price1.mmObject();
		}

		@Override
		public Optional<Price1> getValue(BenchmarkCurve4 obj) {
			return obj.getBenchmarkPrice();
		}

		@Override
		public void setValue(BenchmarkCurve4 obj, Optional<Price1> value) {
			obj.setBenchmarkPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "BchmkCrvCcy")
	protected CurrencyCode benchmarkCurveCurrency;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve4
	 * BenchmarkCurve4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BchmkCrvCcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BenchmarkCurveCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the currency used for the benchmark curve."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 220</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BenchmarkCurve4, Optional<CurrencyCode>> mmBenchmarkCurveCurrency = new MMMessageAttribute<BenchmarkCurve4, Optional<CurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> Curve.mmCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.BenchmarkCurve4.mmObject();
			isDerived = false;
			xmlTag = "BchmkCrvCcy";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "220"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BenchmarkCurveCurrency";
			definition = "Identifies the currency used for the benchmark curve.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public Optional<CurrencyCode> getValue(BenchmarkCurve4 obj) {
			return obj.getBenchmarkCurveCurrency();
		}

		@Override
		public void setValue(BenchmarkCurve4 obj, Optional<CurrencyCode> value) {
			obj.setBenchmarkCurveCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "BchmkCrvNm")
	protected BenchmarkCurveName7Choice benchmarkCurveName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName7Choice
	 * BenchmarkCurveName7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Curve#mmName Curve.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve4
	 * BenchmarkCurve4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BchmkCrvNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BenchmarkCurveName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the name of the benchmark curve."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 221</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BenchmarkCurve4, Optional<BenchmarkCurveName7Choice>> mmBenchmarkCurveName = new MMMessageAttribute<BenchmarkCurve4, Optional<BenchmarkCurveName7Choice>>() {
		{
			businessElementTrace_lazy = () -> Curve.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.BenchmarkCurve4.mmObject();
			isDerived = false;
			xmlTag = "BchmkCrvNm";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "221"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BenchmarkCurveName";
			definition = "Identifies the name of the benchmark curve.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BenchmarkCurveName7Choice.mmObject();
		}

		@Override
		public Optional<BenchmarkCurveName7Choice> getValue(BenchmarkCurve4 obj) {
			return obj.getBenchmarkCurveName();
		}

		@Override
		public void setValue(BenchmarkCurve4 obj, Optional<BenchmarkCurveName7Choice> value) {
			obj.setBenchmarkCurveName(value.orElse(null));
		}
	};
	@XmlElement(name = "BchmkCrvPt")
	protected Max256Text benchmarkCurvePoint;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve4
	 * BenchmarkCurve4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BchmkCrvPt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BenchmarkCurvePoint"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a point on a benchmark curve. The point can be stated via a combination of maturity month/year and coupon."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 222</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BenchmarkCurve4, Optional<Max256Text>> mmBenchmarkCurvePoint = new MMMessageAttribute<BenchmarkCurve4, Optional<Max256Text>>() {
		{
			businessElementTrace_lazy = () -> Curve.mmPoint;
			componentContext_lazy = () -> com.tools20022.repository.msg.BenchmarkCurve4.mmObject();
			isDerived = false;
			xmlTag = "BchmkCrvPt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "222"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BenchmarkCurvePoint";
			definition = "Identifies a point on a benchmark curve. The point can be stated via a combination of maturity month/year and coupon.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}

		@Override
		public Optional<Max256Text> getValue(BenchmarkCurve4 obj) {
			return obj.getBenchmarkCurvePoint();
		}

		@Override
		public void setValue(BenchmarkCurve4 obj, Optional<Max256Text> value) {
			obj.setBenchmarkCurvePoint(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BenchmarkCurve4.mmSpread, com.tools20022.repository.msg.BenchmarkCurve4.mmBenchmarkIdentification,
						com.tools20022.repository.msg.BenchmarkCurve4.mmBenchmarkPrice, com.tools20022.repository.msg.BenchmarkCurve4.mmBenchmarkCurveCurrency, com.tools20022.repository.msg.BenchmarkCurve4.mmBenchmarkCurveName,
						com.tools20022.repository.msg.BenchmarkCurve4.mmBenchmarkCurvePoint);
				trace_lazy = () -> Curve.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "BenchmarkCurve4";
				definition = "Identifies the benchmark against which the financial instrument is measured.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<DecimalNumber> getSpread() {
		return spread == null ? Optional.empty() : Optional.of(spread);
	}

	public BenchmarkCurve4 setSpread(DecimalNumber spread) {
		this.spread = spread;
		return this;
	}

	public Optional<SecurityIdentification19> getBenchmarkIdentification() {
		return benchmarkIdentification == null ? Optional.empty() : Optional.of(benchmarkIdentification);
	}

	public BenchmarkCurve4 setBenchmarkIdentification(SecurityIdentification19 benchmarkIdentification) {
		this.benchmarkIdentification = benchmarkIdentification;
		return this;
	}

	public Optional<Price1> getBenchmarkPrice() {
		return benchmarkPrice == null ? Optional.empty() : Optional.of(benchmarkPrice);
	}

	public BenchmarkCurve4 setBenchmarkPrice(Price1 benchmarkPrice) {
		this.benchmarkPrice = benchmarkPrice;
		return this;
	}

	public Optional<CurrencyCode> getBenchmarkCurveCurrency() {
		return benchmarkCurveCurrency == null ? Optional.empty() : Optional.of(benchmarkCurveCurrency);
	}

	public BenchmarkCurve4 setBenchmarkCurveCurrency(CurrencyCode benchmarkCurveCurrency) {
		this.benchmarkCurveCurrency = benchmarkCurveCurrency;
		return this;
	}

	public Optional<BenchmarkCurveName7Choice> getBenchmarkCurveName() {
		return benchmarkCurveName == null ? Optional.empty() : Optional.of(benchmarkCurveName);
	}

	public BenchmarkCurve4 setBenchmarkCurveName(BenchmarkCurveName7Choice benchmarkCurveName) {
		this.benchmarkCurveName = benchmarkCurveName;
		return this;
	}

	public Optional<Max256Text> getBenchmarkCurvePoint() {
		return benchmarkCurvePoint == null ? Optional.empty() : Optional.of(benchmarkCurvePoint);
	}

	public BenchmarkCurve4 setBenchmarkCurvePoint(Max256Text benchmarkCurvePoint) {
		this.benchmarkCurvePoint = benchmarkCurvePoint;
		return this;
	}
}