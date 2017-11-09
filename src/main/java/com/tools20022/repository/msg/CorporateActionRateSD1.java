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
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionRateSD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action details rates and amounts details."
 * </li>
 * </ul>
 */
public class CorporateActionRateSD1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text placeAndName;
	/**
	 * xPath to the element that is being extended.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "xPath to the element that is being extended."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionRateSD1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected PercentageRate deferredInterestRate;
	/**
	 * Applicable to structured securities where there is a set schedule of
	 * principal and interest payments for the life of the issue. A portion of
	 * the scheduled interest payment will not be paid at the time of
	 * distribution.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeferredInterestRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Applicable to structured securities where there is a set schedule of principal and interest payments for the life of the issue. A portion of the scheduled interest payment will not be paid at the time of distribution.  "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeferredInterestRate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionRateSD1.mmObject();
			isDerived = false;
			xmlTag = "DfrrdIntrstRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeferredInterestRate";
			definition = "Applicable to structured securities where there is a set schedule of principal and interest payments for the life of the issue. A portion of the scheduled interest payment will not be paid at the time of distribution.  ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected PercentageRate interestShortfallRate;
	/**
	 * Applicable for structured security issues where there is a set schedule
	 * of principal and interest payments for the life of the issue. An interest
	 * shortfall occurs when scheduled interest is not paid to the investor as
	 * scheduled.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestShortfallRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Applicable for structured security issues where there is a set schedule of principal and interest payments for the life of the issue. An interest shortfall occurs when scheduled interest is not paid to the investor as scheduled."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterestShortfallRate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionRateSD1.mmObject();
			isDerived = false;
			xmlTag = "IntrstShrtfllRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestShortfallRate";
			definition = "Applicable for structured security issues where there is a set schedule of principal and interest payments for the life of the issue. An interest shortfall occurs when scheduled interest is not paid to the investor as scheduled.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected PercentageRate realisedLossRate;
	/**
	 * Applicable to structured securities where there is a set schedule of
	 * principal and interest payments for the life of the issue. This term
	 * refers specifically to the principal payment of a mortgage. One or more
	 * mortgages within the pool are in default.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RealisedLossRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Applicable to structured securities where there is a set schedule of principal and interest payments for the life of the issue. This term refers specifically to the principal payment of a mortgage. One or more mortgages within the pool are in default."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRealisedLossRate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionRateSD1.mmObject();
			isDerived = false;
			xmlTag = "RealsdLossRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RealisedLossRate";
			definition = "Applicable to structured securities where there is a set schedule of principal and interest payments for the life of the issue. This term refers specifically to the principal payment of a mortgage. One or more mortgages within the pool are in default.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected CorporateActionRateSD2 americanOrGlobalDepositReceiptRatio;
	/**
	 * American or Global Depository Receipt(s) per ordinary share(s) ratio.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmericanOrGlobalDepositReceiptRatio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "American or Global Depository Receipt(s) per ordinary share(s) ratio."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAmericanOrGlobalDepositReceiptRatio = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionRateSD1.mmObject();
			isDerived = false;
			xmlTag = "AmrcnOrGblDpstRctRatio";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmericanOrGlobalDepositReceiptRatio";
			definition = "American or Global Depository Receipt(s) per ordinary share(s) ratio.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionRateSD2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionRateSD1.mmPlaceAndName, CorporateActionRateSD1.mmDeferredInterestRate, CorporateActionRateSD1.mmInterestShortfallRate, CorporateActionRateSD1.mmRealisedLossRate,
						CorporateActionRateSD1.mmAmericanOrGlobalDepositReceiptRatio);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
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

	public void setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
	}

	public PercentageRate getDeferredInterestRate() {
		return deferredInterestRate;
	}

	public void setDeferredInterestRate(PercentageRate deferredInterestRate) {
		this.deferredInterestRate = deferredInterestRate;
	}

	public PercentageRate getInterestShortfallRate() {
		return interestShortfallRate;
	}

	public void setInterestShortfallRate(PercentageRate interestShortfallRate) {
		this.interestShortfallRate = interestShortfallRate;
	}

	public PercentageRate getRealisedLossRate() {
		return realisedLossRate;
	}

	public void setRealisedLossRate(PercentageRate realisedLossRate) {
		this.realisedLossRate = realisedLossRate;
	}

	public CorporateActionRateSD2 getAmericanOrGlobalDepositReceiptRatio() {
		return americanOrGlobalDepositReceiptRatio;
	}

	public void setAmericanOrGlobalDepositReceiptRatio(com.tools20022.repository.msg.CorporateActionRateSD2 americanOrGlobalDepositReceiptRatio) {
		this.americanOrGlobalDepositReceiptRatio = americanOrGlobalDepositReceiptRatio;
	}
}