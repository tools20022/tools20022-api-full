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
import com.tools20022.repository.choice.DateFormat22Choice;
import com.tools20022.repository.choice.RateFormat6Choice;
import com.tools20022.repository.codeset.ReinvestmentPlan1Code;
import com.tools20022.repository.codeset.TypeOfAmount4Code;
import com.tools20022.repository.codeset.TypeOfDate1Code;
import com.tools20022.repository.codeset.TypeOfDateCode;
import com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Extra dates, amounts and related indicators.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DateAndAmountSD1#PlaceAndName
 * DateAndAmountSD1.PlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#FirstSettlementDateOfDeferredTrades
 * DateAndAmountSD1.FirstSettlementDateOfDeferredTrades}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#TypeOfPaymentDate
 * DateAndAmountSD1.TypeOfPaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#EquivalentLocalAmountAnnouncementDate
 * DateAndAmountSD1.EquivalentLocalAmountAnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#TypeOfEquivalentLocalAmountAnnouncementDate
 * DateAndAmountSD1.TypeOfEquivalentLocalAmountAnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#EquivalentForeignAmountAnnouncementDate
 * DateAndAmountSD1.EquivalentForeignAmountAnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#TypeOfEquivalentForeignAmountAnnouncementDate
 * DateAndAmountSD1.TypeOfEquivalentForeignAmountAnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#TypeOfIssueDate
 * DateAndAmountSD1.TypeOfIssueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#PariPassuFromIssueDateIndicator
 * DateAndAmountSD1.PariPassuFromIssueDateIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#LodgementOfSecurityHolderResolutionDate
 * DateAndAmountSD1.LodgementOfSecurityHolderResolutionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#TypeOfLodgementOfSecurityHolderResolutionDate
 * DateAndAmountSD1.TypeOfLodgementOfSecurityHolderResolutionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#SelectiveReturnOfCapitalIndicator
 * DateAndAmountSD1.SelectiveReturnOfCapitalIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#SpecialAmountPerSecurityAnnouncementDate
 * DateAndAmountSD1.SpecialAmountPerSecurityAnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#TypeOfSpecialAmountPerSecurityAnnouncementDate
 * DateAndAmountSD1.TypeOfSpecialAmountPerSecurityAnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#ScripAmountPerSecurityAnnouncementDate
 * DateAndAmountSD1.ScripAmountPerSecurityAnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#TypeOfScripAmountPerSecurityAnnouncementDate
 * DateAndAmountSD1.TypeOfScripAmountPerSecurityAnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#SupplementaryAmountPerSecurityAnnouncementDate
 * DateAndAmountSD1.SupplementaryAmountPerSecurityAnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#TypeOfSupplementaryAmountPerSecurityAnnouncementDate
 * DateAndAmountSD1.TypeOfSupplementaryAmountPerSecurityAnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#AmountPerSecurityAnnouncementDate
 * DateAndAmountSD1.AmountPerSecurityAnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#TypeOfAmountPerSecurityAnnouncementDate
 * DateAndAmountSD1.TypeOfAmountPerSecurityAnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#TypeOfGrossDividendRate
 * DateAndAmountSD1.TypeOfGrossDividendRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#EndDateOfDividendPeriod
 * DateAndAmountSD1.EndDateOfDividendPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#LastTradingDayForOriginalSecurities
 * DateAndAmountSD1.LastTradingDayForOriginalSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#EarliestPostConsolidationNotificationDate
 * DateAndAmountSD1.EarliestPostConsolidationNotificationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#MinimumAmountForParticipation
 * DateAndAmountSD1.MinimumAmountForParticipation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#MaximumAmountForParticipation
 * DateAndAmountSD1.MaximumAmountForParticipation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#ReinvestmentDiscountRate
 * DateAndAmountSD1.ReinvestmentDiscountRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#ReinvestmentPlanType
 * DateAndAmountSD1.ReinvestmentPlanType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DateAndAmountSD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Extra dates, amounts and related indicators."</li>
 * </ul>
 */
public class DateAndAmountSD1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unambiguous reference to the location where the supplementary data must
	 * be inserted in the message instance. <br>
	 * <br>
	 * In the case of XML, this is expressed by a valid XPath.
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
	 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1
	 * DateAndAmountSD1}</li>
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
	 * "Unambiguous reference to the location where the supplementary data must be inserted in the message instance. \r\n\r\nIn the case of XML, this is expressed by a valid XPath."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute PlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "Unambiguous reference to the location where the supplementary data must be inserted in the message instance. \r\n\r\nIn the case of XML, this is expressed by a valid XPath.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * First settlement of deferred settlement trades and normal T+3 trades.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat22Choice
	 * DateFormat22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1
	 * DateAndAmountSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrstSttlmDtOfDfrrdTrds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstSettlementDateOfDeferredTrades"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "First settlement of deferred settlement trades and normal T+3 trades.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd FirstSettlementDateOfDeferredTrades = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "FrstSttlmDtOfDfrrdTrds";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstSettlementDateOfDeferredTrades";
			definition = "First settlement of deferred settlement trades and normal T+3 trades.\r\n";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> DateFormat22Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Specifies whether the payment date is estimated or actual.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfDate1Code
	 * TypeOfDate1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1
	 * DateAndAmountSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TpOfPmtDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfPaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the payment date is estimated or actual."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute TypeOfPaymentDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "TpOfPmtDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfPaymentDate";
			definition = "Specifies whether the payment date is estimated or actual.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> TypeOfDate1Code.mmObject();
		}
	};
	/**
	 * Date when the equivalent amount in the local currency will be announced.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat22Choice
	 * DateFormat22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1
	 * DateAndAmountSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EqvtLclAmtAnncmntDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EquivalentLocalAmountAnnouncementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date when the equivalent amount in the local currency will be announced."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd EquivalentLocalAmountAnnouncementDate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "EqvtLclAmtAnncmntDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EquivalentLocalAmountAnnouncementDate";
			definition = "Date when the equivalent amount in the local currency will be announced.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> DateFormat22Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Specifies whether the Equivalent Local Amount Announcement Date is
	 * estimated or actual.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount4Code
	 * TypeOfAmount4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1
	 * DateAndAmountSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TpOfEqvtLclAmtAnncmntDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfEquivalentLocalAmountAnnouncementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the Equivalent Local Amount Announcement Date is estimated or actual."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute TypeOfEquivalentLocalAmountAnnouncementDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "TpOfEqvtLclAmtAnncmntDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfEquivalentLocalAmountAnnouncementDate";
			definition = "Specifies whether the Equivalent Local Amount Announcement Date is estimated or actual.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> TypeOfAmount4Code.mmObject();
		}
	};
	/**
	 * Date when the equivalent amount in the foreign currency will be
	 * announced.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat22Choice
	 * DateFormat22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1
	 * DateAndAmountSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EqvtFrgnAmtAnncmntDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EquivalentForeignAmountAnnouncementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date when the equivalent amount in the foreign currency will be announced."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd EquivalentForeignAmountAnnouncementDate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "EqvtFrgnAmtAnncmntDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EquivalentForeignAmountAnnouncementDate";
			definition = "Date when the equivalent amount in the foreign currency will be announced.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> DateFormat22Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Specifies whether the Equivalent Foreign Amount Announcement Date is
	 * estimated or actual.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount4Code
	 * TypeOfAmount4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1
	 * DateAndAmountSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TpOfEqvtFrgnAmtAnncmntDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfEquivalentForeignAmountAnnouncementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the Equivalent Foreign Amount Announcement Date is estimated or actual."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute TypeOfEquivalentForeignAmountAnnouncementDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "TpOfEqvtFrgnAmtAnncmntDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfEquivalentForeignAmountAnnouncementDate";
			definition = "Specifies whether the Equivalent Foreign Amount Announcement Date is estimated or actual.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> TypeOfAmount4Code.mmObject();
		}
	};
	/**
	 * Specifies whether the securities issue date is estimated or actual.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfDate1Code
	 * TypeOfDate1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1
	 * DateAndAmountSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TpOfIsseDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfIssueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the securities issue date is estimated or actual."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute TypeOfIssueDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "TpOfIsseDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfIssueDate";
			definition = "Specifies whether the securities issue date is estimated or actual.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> TypeOfDate1Code.mmObject();
		}
	};
	/**
	 * Specifies whether the securities rank pari passu from issue date.<br>
	 * TRUE means yes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1
	 * DateAndAmountSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrpssFrIsseDtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PariPassuFromIssueDateIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the securities rank pari passu from issue date.\r\nTRUE means yes."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute PariPassuFromIssueDateIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "PrpssFrIsseDtInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PariPassuFromIssueDateIndicator";
			definition = "Specifies whether the securities rank pari passu from issue date.\r\nTRUE means yes.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Anticipated or actual date of lodgement of security holder resolution
	 * approving the capital return with ASIC.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat22Choice
	 * DateFormat22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1
	 * DateAndAmountSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LdgmntOfSctyHldrRsltnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LodgementOfSecurityHolderResolutionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Anticipated or actual date of lodgement of security holder resolution approving the capital return with ASIC."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd LodgementOfSecurityHolderResolutionDate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "LdgmntOfSctyHldrRsltnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LodgementOfSecurityHolderResolutionDate";
			definition = "Anticipated or actual date of lodgement of security holder resolution approving the capital return with ASIC.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> DateFormat22Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Specifies whether the Lodgement Of Security Holder Resolution Date is
	 * estimated or actual.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfDate1Code
	 * TypeOfDate1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1
	 * DateAndAmountSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TpOfLdgmntOfSctyHldrRsltnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfLodgementOfSecurityHolderResolutionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the Lodgement Of Security Holder Resolution Date is estimated or actual."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute TypeOfLodgementOfSecurityHolderResolutionDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "TpOfLdgmntOfSctyHldrRsltnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfLodgementOfSecurityHolderResolutionDate";
			definition = "Specifies whether the Lodgement Of Security Holder Resolution Date is estimated or actual.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> TypeOfDate1Code.mmObject();
		}
	};
	/**
	 * Indicator to determine if the capital return is a selective reduction of
	 * capital.<br>
	 * TRUE means yes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1
	 * DateAndAmountSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SelctvRtrOfCptlInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelectiveReturnOfCapitalIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicator to determine if the capital return is a selective reduction of capital.\r\nTRUE means yes."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute SelectiveReturnOfCapitalIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "SelctvRtrOfCptlInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelectiveReturnOfCapitalIndicator";
			definition = "Indicator to determine if the capital return is a selective reduction of capital.\r\nTRUE means yes.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Date or approximate date, that actual special dividend will be announced
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat22Choice
	 * DateFormat22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1
	 * DateAndAmountSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SpclAmtPerSctyAnncmntDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialAmountPerSecurityAnnouncementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date or approximate date, that actual special dividend will be announced"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd SpecialAmountPerSecurityAnnouncementDate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "SpclAmtPerSctyAnncmntDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialAmountPerSecurityAnnouncementDate";
			definition = "Date or approximate date, that actual special dividend will be announced";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> DateFormat22Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Specifies whether the Special Amount Per Security Announcement Date is
	 * actual or estimated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfDateCode
	 * TypeOfDateCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1
	 * DateAndAmountSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TpOfSpclAmtPerSctyAnncmntDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfSpecialAmountPerSecurityAnnouncementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the Special Amount Per Security Announcement Date is actual or estimated."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute TypeOfSpecialAmountPerSecurityAnnouncementDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "TpOfSpclAmtPerSctyAnncmntDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfSpecialAmountPerSecurityAnnouncementDate";
			definition = "Specifies whether the Special Amount Per Security Announcement Date is actual or estimated.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> TypeOfDateCode.mmObject();
		}
	};
	/**
	 * Date or approximate date, that the actual scrip dividend will be
	 * announced.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat22Choice
	 * DateFormat22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1
	 * DateAndAmountSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScripAmtPerSctyAnncmntDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScripAmountPerSecurityAnnouncementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date or approximate date, that the actual scrip dividend will be announced."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ScripAmountPerSecurityAnnouncementDate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "ScripAmtPerSctyAnncmntDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripAmountPerSecurityAnnouncementDate";
			definition = "Date or approximate date, that the actual scrip dividend will be announced.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> DateFormat22Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Specifies whether the Special Amount Per Security Announcement Date is
	 * actual or estimated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfDateCode
	 * TypeOfDateCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1
	 * DateAndAmountSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TpOfScripAmtPerSctyAnncmntDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfScripAmountPerSecurityAnnouncementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the Special Amount Per Security Announcement Date is actual or estimated."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute TypeOfScripAmountPerSecurityAnnouncementDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "TpOfScripAmtPerSctyAnncmntDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfScripAmountPerSecurityAnnouncementDate";
			definition = "Specifies whether the Special Amount Per Security Announcement Date is actual or estimated.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> TypeOfDateCode.mmObject();
		}
	};
	/**
	 * Date or approximate date, that the actual supplementary dividend will be
	 * announced.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat22Choice
	 * DateFormat22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1
	 * DateAndAmountSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryAmtPerSctyAnncmntDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryAmountPerSecurityAnnouncementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date or approximate date, that the actual supplementary dividend will be announced."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd SupplementaryAmountPerSecurityAnnouncementDate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "SplmtryAmtPerSctyAnncmntDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryAmountPerSecurityAnnouncementDate";
			definition = "Date or approximate date, that the actual supplementary dividend will be announced.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> DateFormat22Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Specifies whether the Suppmentary Amount Per Security Announcement Date
	 * is actual or estimated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfDateCode
	 * TypeOfDateCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1
	 * DateAndAmountSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TpOfSplmtryAmtPerSctyAnncmntDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfSupplementaryAmountPerSecurityAnnouncementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the Suppmentary Amount Per Security Announcement Date is actual or estimated."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute TypeOfSupplementaryAmountPerSecurityAnnouncementDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "TpOfSplmtryAmtPerSctyAnncmntDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfSupplementaryAmountPerSecurityAnnouncementDate";
			definition = "Specifies whether the Suppmentary Amount Per Security Announcement Date is actual or estimated.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> TypeOfDateCode.mmObject();
		}
	};
	/**
	 * Date or approximate date, that actual ordinary dividend will be
	 * announced.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat22Choice
	 * DateFormat22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1
	 * DateAndAmountSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtPerSctyAnncmntDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountPerSecurityAnnouncementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date or approximate date, that actual ordinary dividend will be announced."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd AmountPerSecurityAnnouncementDate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "AmtPerSctyAnncmntDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountPerSecurityAnnouncementDate";
			definition = "Date or approximate date, that actual ordinary dividend will be announced.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> DateFormat22Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Specifies whether the ordinary Amount Per Security Announcement Date is
	 * actual or estimated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfDateCode
	 * TypeOfDateCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1
	 * DateAndAmountSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TpOfAmtPerSctyAnncmntDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfAmountPerSecurityAnnouncementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the ordinary Amount Per Security Announcement Date is actual or estimated."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute TypeOfAmountPerSecurityAnnouncementDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "TpOfAmtPerSctyAnncmntDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfAmountPerSecurityAnnouncementDate";
			definition = "Specifies whether the ordinary Amount Per Security Announcement Date is actual or estimated.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> TypeOfDateCode.mmObject();
		}
	};
	/**
	 * Specifies whether the Gross Dividend Rate is estimated or actual.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount4Code
	 * TypeOfAmount4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1
	 * DateAndAmountSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TpOfGrssDvddRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfGrossDividendRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the Gross Dividend Rate is estimated or actual."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute TypeOfGrossDividendRate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "TpOfGrssDvddRate";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfGrossDividendRate";
			definition = "Specifies whether the Gross Dividend Rate is estimated or actual.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> TypeOfAmount4Code.mmObject();
		}
	};
	/**
	 * Date which marks the end of the period for which the dividend is to be
	 * declared.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat22Choice
	 * DateFormat22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1
	 * DateAndAmountSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EndDtOfDvddPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndDateOfDividendPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date which marks the end of the period for which the dividend is to be declared."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd EndDateOfDividendPeriod = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "EndDtOfDvddPrd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndDateOfDividendPeriod";
			definition = "Date which marks the end of the period for which the dividend is to be declared.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> DateFormat22Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Last day for trading in pre-reorganisation securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat22Choice
	 * DateFormat22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1
	 * DateAndAmountSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LastTradgDayForOrgnlScties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastTradingDayForOriginalSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Last day for trading in pre-reorganisation securities. "</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd LastTradingDayForOriginalSecurities = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "LastTradgDayForOrgnlScties";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastTradingDayForOriginalSecurities";
			definition = "Last day for trading in pre-reorganisation securities. ";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> DateFormat22Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * First day to send notices to security holders and register securities on
	 * a post-reorganisation basis.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat22Choice
	 * DateFormat22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1
	 * DateAndAmountSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EarlstPstCnsldtnNtfctnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarliestPostConsolidationNotificationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "First day to send notices to security holders and register securities on a post-reorganisation basis."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd EarliestPostConsolidationNotificationDate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "EarlstPstCnsldtnNtfctnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarliestPostConsolidationNotificationDate";
			definition = "First day to send notices to security holders and register securities on a post-reorganisation basis.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> DateFormat22Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Minimum amount for a single securityholder participating in the plan, in
	 * the primary currency. <br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount
	 * ActiveCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1
	 * DateAndAmountSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinAmtForPrtcptn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumAmountForParticipation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum amount for a single securityholder participating in the plan, in the primary currency.\r\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute MinimumAmountForParticipation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "MinAmtForPrtcptn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumAmountForParticipation";
			definition = "Minimum amount for a single securityholder participating in the plan, in the primary currency.\r\r\n";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAnd13DecimalAmount.mmObject();
		}
	};
	/**
	 * Maximum amount for a single security holder participating in the plan, in
	 * the primary currency. <br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount
	 * ActiveCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1
	 * DateAndAmountSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxAmtForPrtcptn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumAmountForParticipation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum amount for a single security holder participating in the plan, in the primary currency.\r\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute MaximumAmountForParticipation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "MaxAmtForPrtcptn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumAmountForParticipation";
			definition = "Maximum amount for a single security holder participating in the plan, in the primary currency.\r\r\n";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAnd13DecimalAmount.mmObject();
		}
	};
	/**
	 * Percentage discount applied to the weighted average DRP/BSP/Plan issue
	 * price calculated as part of the DRP/BSP/Plan.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RateFormat6Choice
	 * RateFormat6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1
	 * DateAndAmountSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RinvstmtDscntRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinvestmentDiscountRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage discount applied to the weighted average DRP/BSP/Plan issue price calculated as part of the DRP/BSP/Plan.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ReinvestmentDiscountRate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "RinvstmtDscntRate";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReinvestmentDiscountRate";
			definition = "Percentage discount applied to the weighted average DRP/BSP/Plan issue price calculated as part of the DRP/BSP/Plan.\r\n";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> RateFormat6Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Indicates for whom this reinvestment plan applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ReinvestmentPlan1Code
	 * ReinvestmentPlan1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1
	 * DateAndAmountSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RinvstmtPlanTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinvestmentPlanType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates for whom this reinvestment plan applies."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute ReinvestmentPlanType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "RinvstmtPlanTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReinvestmentPlanType";
			definition = "Indicates for whom this reinvestment plan applies.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ReinvestmentPlan1Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DateAndAmountSD1.PlaceAndName, com.tools20022.repository.msg.DateAndAmountSD1.FirstSettlementDateOfDeferredTrades,
						com.tools20022.repository.msg.DateAndAmountSD1.TypeOfPaymentDate, com.tools20022.repository.msg.DateAndAmountSD1.EquivalentLocalAmountAnnouncementDate,
						com.tools20022.repository.msg.DateAndAmountSD1.TypeOfEquivalentLocalAmountAnnouncementDate, com.tools20022.repository.msg.DateAndAmountSD1.EquivalentForeignAmountAnnouncementDate,
						com.tools20022.repository.msg.DateAndAmountSD1.TypeOfEquivalentForeignAmountAnnouncementDate, com.tools20022.repository.msg.DateAndAmountSD1.TypeOfIssueDate,
						com.tools20022.repository.msg.DateAndAmountSD1.PariPassuFromIssueDateIndicator, com.tools20022.repository.msg.DateAndAmountSD1.LodgementOfSecurityHolderResolutionDate,
						com.tools20022.repository.msg.DateAndAmountSD1.TypeOfLodgementOfSecurityHolderResolutionDate, com.tools20022.repository.msg.DateAndAmountSD1.SelectiveReturnOfCapitalIndicator,
						com.tools20022.repository.msg.DateAndAmountSD1.SpecialAmountPerSecurityAnnouncementDate, com.tools20022.repository.msg.DateAndAmountSD1.TypeOfSpecialAmountPerSecurityAnnouncementDate,
						com.tools20022.repository.msg.DateAndAmountSD1.ScripAmountPerSecurityAnnouncementDate, com.tools20022.repository.msg.DateAndAmountSD1.TypeOfScripAmountPerSecurityAnnouncementDate,
						com.tools20022.repository.msg.DateAndAmountSD1.SupplementaryAmountPerSecurityAnnouncementDate, com.tools20022.repository.msg.DateAndAmountSD1.TypeOfSupplementaryAmountPerSecurityAnnouncementDate,
						com.tools20022.repository.msg.DateAndAmountSD1.AmountPerSecurityAnnouncementDate, com.tools20022.repository.msg.DateAndAmountSD1.TypeOfAmountPerSecurityAnnouncementDate,
						com.tools20022.repository.msg.DateAndAmountSD1.TypeOfGrossDividendRate, com.tools20022.repository.msg.DateAndAmountSD1.EndDateOfDividendPeriod,
						com.tools20022.repository.msg.DateAndAmountSD1.LastTradingDayForOriginalSecurities, com.tools20022.repository.msg.DateAndAmountSD1.EarliestPostConsolidationNotificationDate,
						com.tools20022.repository.msg.DateAndAmountSD1.MinimumAmountForParticipation, com.tools20022.repository.msg.DateAndAmountSD1.MaximumAmountForParticipation,
						com.tools20022.repository.msg.DateAndAmountSD1.ReinvestmentDiscountRate, com.tools20022.repository.msg.DateAndAmountSD1.ReinvestmentPlanType);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DateAndAmountSD1";
				definition = "Extra dates, amounts and related indicators.";
			}
		});
		return mmObject_lazy.get();
	}
}