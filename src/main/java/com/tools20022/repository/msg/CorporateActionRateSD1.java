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

import com.tools20022.metamodel.ext.DTCCSynonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CorporateActionRateSD2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information regarding corporate action details rates and
 * amounts details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD1#mmPlaceAndName
 * CorporateActionRateSD1.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD1#mmDeferredInterestRate
 * CorporateActionRateSD1.mmDeferredInterestRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD1#mmInterestShortfallRate
 * CorporateActionRateSD1.mmInterestShortfallRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD1#mmRealisedLossRate
 * CorporateActionRateSD1.mmRealisedLossRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD1#mmAmericanOrGlobalDepositReceiptRatio
 * CorporateActionRateSD1.mmAmericanOrGlobalDepositReceiptRatio}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionRateSD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action details rates and amounts details."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionRateSD1", propOrder = {"placeAndName", "deferredInterestRate", "interestShortfallRate", "realisedLossRate", "americanOrGlobalDepositReceiptRatio"})
public class CorporateActionRateSD1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm", required = true)
	protected Max350Text placeAndName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD1
	 * CorporateActionRateSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "xPath to the element that is being extended."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionRateSD1, Max350Text> mmPlaceAndName = new MMMessageAttribute<CorporateActionRateSD1, Max350Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRateSD1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(CorporateActionRateSD1 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(CorporateActionRateSD1 obj, Max350Text value) {
			obj.setPlaceAndName(value);
		}
	};
	@XmlElement(name = "DfrrdIntrstRate")
	protected PercentageRate deferredInterestRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD1
	 * CorporateActionRateSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DfrrdIntrstRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeferredInterestRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Applicable to structured securities where there is a set schedule of principal and interest payments for the life of the issue. A portion of the scheduled interest payment will not be paid at the time of distribution."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Deferred Interest Rate</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionRateSD1, Optional<PercentageRate>> mmDeferredInterestRate = new MMMessageAttribute<CorporateActionRateSD1, Optional<PercentageRate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRateSD1.mmObject();
			isDerived = false;
			xmlTag = "DfrrdIntrstRate";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Deferred Interest Rate"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeferredInterestRate";
			definition = "Applicable to structured securities where there is a set schedule of principal and interest payments for the life of the issue. A portion of the scheduled interest payment will not be paid at the time of distribution.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(CorporateActionRateSD1 obj) {
			return obj.getDeferredInterestRate();
		}

		@Override
		public void setValue(CorporateActionRateSD1 obj, Optional<PercentageRate> value) {
			obj.setDeferredInterestRate(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrstShrtfllRate")
	protected PercentageRate interestShortfallRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD1
	 * CorporateActionRateSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstShrtfllRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestShortfallRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Applicable for structured security issues where there is a set schedule of principal and interest payments for the life of the issue. An interest shortfall occurs when scheduled interest is not paid to the investor as scheduled."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Interest Shortfall Rate</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionRateSD1, Optional<PercentageRate>> mmInterestShortfallRate = new MMMessageAttribute<CorporateActionRateSD1, Optional<PercentageRate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRateSD1.mmObject();
			isDerived = false;
			xmlTag = "IntrstShrtfllRate";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Interest Shortfall Rate"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestShortfallRate";
			definition = "Applicable for structured security issues where there is a set schedule of principal and interest payments for the life of the issue. An interest shortfall occurs when scheduled interest is not paid to the investor as scheduled.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(CorporateActionRateSD1 obj) {
			return obj.getInterestShortfallRate();
		}

		@Override
		public void setValue(CorporateActionRateSD1 obj, Optional<PercentageRate> value) {
			obj.setInterestShortfallRate(value.orElse(null));
		}
	};
	@XmlElement(name = "RealsdLossRate")
	protected PercentageRate realisedLossRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD1
	 * CorporateActionRateSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RealsdLossRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RealisedLossRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Applicable to structured securities where there is a set schedule of principal and interest payments for the life of the issue. This term refers specifically to the principal payment of a mortgage. One or more mortgages within the pool are in default."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Realized Loss Rate</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionRateSD1, Optional<PercentageRate>> mmRealisedLossRate = new MMMessageAttribute<CorporateActionRateSD1, Optional<PercentageRate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRateSD1.mmObject();
			isDerived = false;
			xmlTag = "RealsdLossRate";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Realized Loss Rate"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RealisedLossRate";
			definition = "Applicable to structured securities where there is a set schedule of principal and interest payments for the life of the issue. This term refers specifically to the principal payment of a mortgage. One or more mortgages within the pool are in default.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(CorporateActionRateSD1 obj) {
			return obj.getRealisedLossRate();
		}

		@Override
		public void setValue(CorporateActionRateSD1 obj, Optional<PercentageRate> value) {
			obj.setRealisedLossRate(value.orElse(null));
		}
	};
	@XmlElement(name = "AmrcnOrGblDpstRctRatio")
	protected CorporateActionRateSD2 americanOrGlobalDepositReceiptRatio;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionRateSD2
	 * CorporateActionRateSD2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD1
	 * CorporateActionRateSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmrcnOrGblDpstRctRatio"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmericanOrGlobalDepositReceiptRatio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "American or Global Depository Receipt(s) per ordinary share(s) ratio."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionRateSD1, Optional<CorporateActionRateSD2>> mmAmericanOrGlobalDepositReceiptRatio = new MMMessageAssociationEnd<CorporateActionRateSD1, Optional<CorporateActionRateSD2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRateSD1.mmObject();
			isDerived = false;
			xmlTag = "AmrcnOrGblDpstRctRatio";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmericanOrGlobalDepositReceiptRatio";
			definition = "American or Global Depository Receipt(s) per ordinary share(s) ratio.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionRateSD2.mmObject();
		}

		@Override
		public Optional<CorporateActionRateSD2> getValue(CorporateActionRateSD1 obj) {
			return obj.getAmericanOrGlobalDepositReceiptRatio();
		}

		@Override
		public void setValue(CorporateActionRateSD1 obj, Optional<CorporateActionRateSD2> value) {
			obj.setAmericanOrGlobalDepositReceiptRatio(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRateSD1.mmPlaceAndName, com.tools20022.repository.msg.CorporateActionRateSD1.mmDeferredInterestRate,
						com.tools20022.repository.msg.CorporateActionRateSD1.mmInterestShortfallRate, com.tools20022.repository.msg.CorporateActionRateSD1.mmRealisedLossRate,
						com.tools20022.repository.msg.CorporateActionRateSD1.mmAmericanOrGlobalDepositReceiptRatio);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateActionRateSD1";
				definition = "Provides additional information regarding corporate action details rates and amounts details.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public CorporateActionRateSD1 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public Optional<PercentageRate> getDeferredInterestRate() {
		return deferredInterestRate == null ? Optional.empty() : Optional.of(deferredInterestRate);
	}

	public CorporateActionRateSD1 setDeferredInterestRate(PercentageRate deferredInterestRate) {
		this.deferredInterestRate = deferredInterestRate;
		return this;
	}

	public Optional<PercentageRate> getInterestShortfallRate() {
		return interestShortfallRate == null ? Optional.empty() : Optional.of(interestShortfallRate);
	}

	public CorporateActionRateSD1 setInterestShortfallRate(PercentageRate interestShortfallRate) {
		this.interestShortfallRate = interestShortfallRate;
		return this;
	}

	public Optional<PercentageRate> getRealisedLossRate() {
		return realisedLossRate == null ? Optional.empty() : Optional.of(realisedLossRate);
	}

	public CorporateActionRateSD1 setRealisedLossRate(PercentageRate realisedLossRate) {
		this.realisedLossRate = realisedLossRate;
		return this;
	}

	public Optional<CorporateActionRateSD2> getAmericanOrGlobalDepositReceiptRatio() {
		return americanOrGlobalDepositReceiptRatio == null ? Optional.empty() : Optional.of(americanOrGlobalDepositReceiptRatio);
	}

	public CorporateActionRateSD1 setAmericanOrGlobalDepositReceiptRatio(CorporateActionRateSD2 americanOrGlobalDepositReceiptRatio) {
		this.americanOrGlobalDepositReceiptRatio = americanOrGlobalDepositReceiptRatio;
		return this;
	}
}