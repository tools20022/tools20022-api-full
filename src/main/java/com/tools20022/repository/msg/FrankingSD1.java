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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.FrankingClass1Code;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAnd13DecimalAmount;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Franking details
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.FrankingSD1#mmPlaceAndName
 * FrankingSD1.mmPlaceAndName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FrankingSD1#mmFrankingClass
 * FrankingSD1.mmFrankingClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FrankingSD1#mmFullyFrankedIndicator
 * FrankingSD1.mmFullyFrankedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FrankingSD1#mmFrankedPercentage
 * FrankingSD1.mmFrankedPercentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FrankingSD1#mmUnfrankedPercentage
 * FrankingSD1.mmUnfrankedPercentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FrankingSD1#mmCorporateTaxRateForFrankingCredit
 * FrankingSD1.mmCorporateTaxRateForFrankingCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FrankingSD1#mmFrankedAmountPerSecurity
 * FrankingSD1.mmFrankedAmountPerSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FrankingSD1#mmUnfrankedAmountPerSecurity
 * FrankingSD1.mmUnfrankedAmountPerSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FrankingSD1#mmConduitForeignIncomeAmount
 * FrankingSD1.mmConduitForeignIncomeAmount}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FrankingSD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Franking details"</li>
 * </ul>
 */
public class FrankingSD1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text placeAndName;
	/**
	 * Unambiguous reference to the location where the supplementary data must
	 * be inserted in the message instance.
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
	 * {@linkplain com.tools20022.repository.msg.FrankingSD1 FrankingSD1}</li>
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
	 * definition} =
	 * "Unambiguous reference to the location where the supplementary data must be inserted in the message instance. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FrankingSD1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "Unambiguous reference to the location where the supplementary data must be inserted in the message instance. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected FrankingClass1Code frankingClass;
	/**
	 * Dividend / Distribution kind where the franking information apples to.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FrankingClass1Code
	 * FrankingClass1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FrankingSD1 FrankingSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrnkgClss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrankingClass"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend / Distribution kind where the franking information apples to."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFrankingClass = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FrankingSD1.mmObject();
			isDerived = false;
			xmlTag = "FrnkgClss";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrankingClass";
			definition = "Dividend / Distribution kind where the franking information apples to.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrankingClass1Code.mmObject();
		}
	};
	protected YesNoIndicator fullyFrankedIndicator;
	/**
	 * Indicator if the dividend is fully franked.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FrankingSD1 FrankingSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FullyFrnkdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullyFrankedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicator if the dividend is fully franked."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFullyFrankedIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FrankingSD1.mmObject();
			isDerived = false;
			xmlTag = "FullyFrnkdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullyFrankedIndicator";
			definition = "Indicator if the dividend is fully franked.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected PercentageRate frankedPercentage;
	/**
	 * Percentage of dividend that is franked.
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
	 * {@linkplain com.tools20022.repository.msg.FrankingSD1 FrankingSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrnkdPctg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrankedPercentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Percentage of dividend that is franked."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFrankedPercentage = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FrankingSD1.mmObject();
			isDerived = false;
			xmlTag = "FrnkdPctg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrankedPercentage";
			definition = "Percentage of dividend that is franked.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected PercentageRate unfrankedPercentage;
	/**
	 * Percentage of dividend that is unfranked.
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
	 * {@linkplain com.tools20022.repository.msg.FrankingSD1 FrankingSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UfrnkdPctg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnfrankedPercentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Percentage of dividend that is unfranked."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUnfrankedPercentage = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FrankingSD1.mmObject();
			isDerived = false;
			xmlTag = "UfrnkdPctg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnfrankedPercentage";
			definition = "Percentage of dividend that is unfranked.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected PercentageRate corporateTaxRateForFrankingCredit;
	/**
	 * The corporate tax rate for the for franking credit of the dividend.<br>
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
	 * {@linkplain com.tools20022.repository.msg.FrankingSD1 FrankingSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpTaxRateForFrnkgCdt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateTaxRateForFrankingCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The corporate tax rate for the for franking credit of the dividend.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCorporateTaxRateForFrankingCredit = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FrankingSD1.mmObject();
			isDerived = false;
			xmlTag = "CorpTaxRateForFrnkgCdt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateTaxRateForFrankingCredit";
			definition = "The corporate tax rate for the for franking credit of the dividend.\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAnd13DecimalAmount frankedAmountPerSecurity;
	/**
	 * Cents amount of the dividend which has been franked at 30%.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAnd13DecimalAmount
	 * RestrictedFINActiveCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FrankingSD1 FrankingSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrnkdAmtPerScty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrankedAmountPerSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cents amount of the dividend which has been franked at 30%."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFrankedAmountPerSecurity = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FrankingSD1.mmObject();
			isDerived = false;
			xmlTag = "FrnkdAmtPerScty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrankedAmountPerSecurity";
			definition = "Cents amount of the dividend which has been franked at 30%.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAnd13DecimalAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAnd13DecimalAmount unfrankedAmountPerSecurity;
	/**
	 * Amount of the dividend which has been unfranked. <br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAnd13DecimalAmount
	 * RestrictedFINActiveCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FrankingSD1 FrankingSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UfrnkdAmtPerScty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnfrankedAmountPerSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of the dividend which has been unfranked.\r\r\n"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUnfrankedAmountPerSecurity = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FrankingSD1.mmObject();
			isDerived = false;
			xmlTag = "UfrnkdAmtPerScty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnfrankedAmountPerSecurity";
			definition = "Amount of the dividend which has been unfranked.\r\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAnd13DecimalAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAnd13DecimalAmount conduitForeignIncomeAmount;
	/**
	 * Conduit foreign income (CFI) amount related to the corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAnd13DecimalAmount
	 * RestrictedFINActiveCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FrankingSD1 FrankingSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CndtFrgnIncmAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConduitForeignIncomeAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Conduit foreign income (CFI) amount related to the corporate action."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmConduitForeignIncomeAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FrankingSD1.mmObject();
			isDerived = false;
			xmlTag = "CndtFrgnIncmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConduitForeignIncomeAmount";
			definition = "Conduit foreign income (CFI) amount related to the corporate action.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAnd13DecimalAmount.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(FrankingSD1.mmPlaceAndName, FrankingSD1.mmFrankingClass, FrankingSD1.mmFullyFrankedIndicator, FrankingSD1.mmFrankedPercentage, FrankingSD1.mmUnfrankedPercentage,
						FrankingSD1.mmCorporateTaxRateForFrankingCredit, FrankingSD1.mmFrankedAmountPerSecurity, FrankingSD1.mmUnfrankedAmountPerSecurity, FrankingSD1.mmConduitForeignIncomeAmount);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FrankingSD1";
				definition = "Franking details";
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

	public FrankingClass1Code getFrankingClass() {
		return frankingClass;
	}

	public void setFrankingClass(FrankingClass1Code frankingClass) {
		this.frankingClass = frankingClass;
	}

	public YesNoIndicator getFullyFrankedIndicator() {
		return fullyFrankedIndicator;
	}

	public void setFullyFrankedIndicator(YesNoIndicator fullyFrankedIndicator) {
		this.fullyFrankedIndicator = fullyFrankedIndicator;
	}

	public PercentageRate getFrankedPercentage() {
		return frankedPercentage;
	}

	public void setFrankedPercentage(PercentageRate frankedPercentage) {
		this.frankedPercentage = frankedPercentage;
	}

	public PercentageRate getUnfrankedPercentage() {
		return unfrankedPercentage;
	}

	public void setUnfrankedPercentage(PercentageRate unfrankedPercentage) {
		this.unfrankedPercentage = unfrankedPercentage;
	}

	public PercentageRate getCorporateTaxRateForFrankingCredit() {
		return corporateTaxRateForFrankingCredit;
	}

	public void setCorporateTaxRateForFrankingCredit(PercentageRate corporateTaxRateForFrankingCredit) {
		this.corporateTaxRateForFrankingCredit = corporateTaxRateForFrankingCredit;
	}

	public RestrictedFINActiveCurrencyAnd13DecimalAmount getFrankedAmountPerSecurity() {
		return frankedAmountPerSecurity;
	}

	public void setFrankedAmountPerSecurity(RestrictedFINActiveCurrencyAnd13DecimalAmount frankedAmountPerSecurity) {
		this.frankedAmountPerSecurity = frankedAmountPerSecurity;
	}

	public RestrictedFINActiveCurrencyAnd13DecimalAmount getUnfrankedAmountPerSecurity() {
		return unfrankedAmountPerSecurity;
	}

	public void setUnfrankedAmountPerSecurity(RestrictedFINActiveCurrencyAnd13DecimalAmount unfrankedAmountPerSecurity) {
		this.unfrankedAmountPerSecurity = unfrankedAmountPerSecurity;
	}

	public RestrictedFINActiveCurrencyAnd13DecimalAmount getConduitForeignIncomeAmount() {
		return conduitForeignIncomeAmount;
	}

	public void setConduitForeignIncomeAmount(RestrictedFINActiveCurrencyAnd13DecimalAmount conduitForeignIncomeAmount) {
		this.conduitForeignIncomeAmount = conduitForeignIncomeAmount;
	}
}