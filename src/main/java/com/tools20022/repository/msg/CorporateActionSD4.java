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
import com.tools20022.repository.codeset.QualifiedDividendTax1Code;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAnd13DecimalAmount;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides additional information regarding corporate action details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD4#mmPlaceAndName
 * CorporateActionSD4.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD4#mmNewParValue
 * CorporateActionSD4.mmNewParValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD4#mmOldParValue
 * CorporateActionSD4.mmOldParValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD4#mmExchangeFeeRequiredFlag
 * CorporateActionSD4.mmExchangeFeeRequiredFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD4#mmCustodianShellFlag
 * CorporateActionSD4.mmCustodianShellFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD4#mmMustAllSharesBeSubmittedFlag
 * CorporateActionSD4.mmMustAllSharesBeSubmittedFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD4#mmLotteryDetails
 * CorporateActionSD4.mmLotteryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD4#mmQualifiedDividendTaxIndicator
 * CorporateActionSD4.mmQualifiedDividendTaxIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD4#mmSurvivingCompany
 * CorporateActionSD4.mmSurvivingCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD4#mmForeignIncomeSourceFlag
 * CorporateActionSD4.mmForeignIncomeSourceFlag}</li>
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
 * "CorporateActionSD4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action details."</li>
 * </ul>
 */
public class CorporateActionSD4 {

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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD4
	 * CorporateActionSD4}</li>
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
			componentContext_lazy = () -> CorporateActionSD4.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAnd13DecimalAmount newParValue;
	/**
	 * New par value of a security.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD4
	 * CorporateActionSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewParVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewParValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "New par value of a security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNewParValue = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionSD4.mmObject();
			isDerived = false;
			xmlTag = "NewParVal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewParValue";
			definition = "New par value of a security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAnd13DecimalAmount.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAnd13DecimalAmount oldParValue;
	/**
	 * Old par value of the event security represents the previously established
	 * par value that has changed in par value event. Used in combination with
	 * new par value element to represent the difference.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD4
	 * CorporateActionSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OdParVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OldParValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Old par value of the event security represents the previously established par value that has changed in par value event. Used in combination with new par value element to represent the difference."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOldParValue = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionSD4.mmObject();
			isDerived = false;
			xmlTag = "OdParVal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OldParValue";
			definition = "Old par value of the event security represents the previously established par value that has changed in par value event. Used in combination with new par value element to represent the difference.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAnd13DecimalAmount.mmObject();
		}
	};
	protected YesNoIndicator exchangeFeeRequiredFlag;
	/**
	 * Indicates whether the event agent is charging a cancellation and or
	 * issuance fee upon the exchange of securities.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD4
	 * CorporateActionSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XchgFeeReqrdFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeFeeRequiredFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the event agent is charging a cancellation and or issuance fee upon the exchange of securities."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExchangeFeeRequiredFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionSD4.mmObject();
			isDerived = false;
			xmlTag = "XchgFeeReqrdFlg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeFeeRequiredFlag";
			definition = "Indicates whether the event agent is charging a cancellation and or issuance fee upon the exchange of securities.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator custodianShellFlag;
	/**
	 * GCA VS-specific flag that indicates whether a composite record has been
	 * generated as a result of custodian information that has not yet been
	 * confirmed in the market.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD4
	 * CorporateActionSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtdnShellFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodianShellFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GCA VS-specific flag that indicates whether a composite record has been generated as a result of custodian information that has not yet been confirmed in the market."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCustodianShellFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionSD4.mmObject();
			isDerived = false;
			xmlTag = "CtdnShellFlg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodianShellFlag";
			definition = "GCA VS-specific flag that indicates whether a composite record has been generated as a result of custodian information that has not yet been confirmed in the market.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator mustAllSharesBeSubmittedFlag;
	/**
	 * Indicates whether the issuer requires a holder to present the entire
	 * account balance in order to be eligible for the offer.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD4
	 * CorporateActionSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MustAllShrsBeSubmittdFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MustAllSharesBeSubmittedFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the issuer requires a holder to present the entire account balance in order to be eligible for the offer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMustAllSharesBeSubmittedFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionSD4.mmObject();
			isDerived = false;
			xmlTag = "MustAllShrsBeSubmittdFlg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MustAllSharesBeSubmittedFlag";
			definition = "Indicates whether the issuer requires a holder to present the entire account balance in order to be eligible for the offer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected CorporateActionSD6 lotteryDetails;
	/**
	 * Provides details about the lottery that has been drawn as a part of the
	 * corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionSD6
	 * CorporateActionSD6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD4
	 * CorporateActionSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LtryDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotteryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the lottery that has been drawn as a part of the corporate action event."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLotteryDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionSD4.mmObject();
			isDerived = false;
			xmlTag = "LtryDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LotteryDetails";
			definition = "Provides details about the lottery that has been drawn as a part of the corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionSD6.mmObject();
		}
	};
	protected QualifiedDividendTax1Code qualifiedDividendTaxIndicator;
	/**
	 * Indicates whether the dividend as whole or in part qualifies for lower/
	 * favourable tax rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.QualifiedDividendTax1Code
	 * QualifiedDividendTax1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD4
	 * CorporateActionSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QlfdDvddTaxInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QualifiedDividendTaxIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the dividend as whole or in part qualifies for lower/ favourable tax rate."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQualifiedDividendTaxIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionSD4.mmObject();
			isDerived = false;
			xmlTag = "QlfdDvddTaxInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QualifiedDividendTaxIndicator";
			definition = "Indicates whether the dividend as whole or in part qualifies for lower/ favourable tax rate.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> QualifiedDividendTax1Code.mmObject();
		}
	};
	protected Max70Text survivingCompany;
	/**
	 * Name of the company that will remain (possibly a new name), usually
	 * designated after a merger.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD4
	 * CorporateActionSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SrvvgCpny"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SurvivingCompany"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of the company that will remain (possibly a new name), usually designated after a merger."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSurvivingCompany = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionSD4.mmObject();
			isDerived = false;
			xmlTag = "SrvvgCpny";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SurvivingCompany";
			definition = "Name of the company that will remain (possibly a new name), usually designated after a merger.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected YesNoIndicator foreignIncomeSourceFlag;
	/**
	 * Indicates when all or part of the distribution is paid from foreign
	 * sourced income of the issuer.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD4
	 * CorporateActionSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrgnIncmSrcFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignIncomeSourceFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates when all or part of the distribution is paid from foreign sourced income of the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmForeignIncomeSourceFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionSD4.mmObject();
			isDerived = false;
			xmlTag = "FrgnIncmSrcFlg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignIncomeSourceFlag";
			definition = "Indicates when all or part of the distribution is paid from foreign sourced income of the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionSD4.mmPlaceAndName, com.tools20022.repository.msg.CorporateActionSD4.mmNewParValue,
						com.tools20022.repository.msg.CorporateActionSD4.mmOldParValue, com.tools20022.repository.msg.CorporateActionSD4.mmExchangeFeeRequiredFlag, com.tools20022.repository.msg.CorporateActionSD4.mmCustodianShellFlag,
						com.tools20022.repository.msg.CorporateActionSD4.mmMustAllSharesBeSubmittedFlag, com.tools20022.repository.msg.CorporateActionSD4.mmLotteryDetails,
						com.tools20022.repository.msg.CorporateActionSD4.mmQualifiedDividendTaxIndicator, com.tools20022.repository.msg.CorporateActionSD4.mmSurvivingCompany,
						com.tools20022.repository.msg.CorporateActionSD4.mmForeignIncomeSourceFlag);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateActionSD4";
				definition = "Provides additional information regarding corporate action details.";
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

	public RestrictedFINActiveCurrencyAnd13DecimalAmount getNewParValue() {
		return newParValue;
	}

	public void setNewParValue(RestrictedFINActiveCurrencyAnd13DecimalAmount newParValue) {
		this.newParValue = newParValue;
	}

	public RestrictedFINActiveCurrencyAnd13DecimalAmount getOldParValue() {
		return oldParValue;
	}

	public void setOldParValue(RestrictedFINActiveCurrencyAnd13DecimalAmount oldParValue) {
		this.oldParValue = oldParValue;
	}

	public YesNoIndicator getExchangeFeeRequiredFlag() {
		return exchangeFeeRequiredFlag;
	}

	public void setExchangeFeeRequiredFlag(YesNoIndicator exchangeFeeRequiredFlag) {
		this.exchangeFeeRequiredFlag = exchangeFeeRequiredFlag;
	}

	public YesNoIndicator getCustodianShellFlag() {
		return custodianShellFlag;
	}

	public void setCustodianShellFlag(YesNoIndicator custodianShellFlag) {
		this.custodianShellFlag = custodianShellFlag;
	}

	public YesNoIndicator getMustAllSharesBeSubmittedFlag() {
		return mustAllSharesBeSubmittedFlag;
	}

	public void setMustAllSharesBeSubmittedFlag(YesNoIndicator mustAllSharesBeSubmittedFlag) {
		this.mustAllSharesBeSubmittedFlag = mustAllSharesBeSubmittedFlag;
	}

	public CorporateActionSD6 getLotteryDetails() {
		return lotteryDetails;
	}

	public void setLotteryDetails(com.tools20022.repository.msg.CorporateActionSD6 lotteryDetails) {
		this.lotteryDetails = lotteryDetails;
	}

	public QualifiedDividendTax1Code getQualifiedDividendTaxIndicator() {
		return qualifiedDividendTaxIndicator;
	}

	public void setQualifiedDividendTaxIndicator(QualifiedDividendTax1Code qualifiedDividendTaxIndicator) {
		this.qualifiedDividendTaxIndicator = qualifiedDividendTaxIndicator;
	}

	public Max70Text getSurvivingCompany() {
		return survivingCompany;
	}

	public void setSurvivingCompany(Max70Text survivingCompany) {
		this.survivingCompany = survivingCompany;
	}

	public YesNoIndicator getForeignIncomeSourceFlag() {
		return foreignIncomeSourceFlag;
	}

	public void setForeignIncomeSourceFlag(YesNoIndicator foreignIncomeSourceFlag) {
		this.foreignIncomeSourceFlag = foreignIncomeSourceFlag;
	}
}