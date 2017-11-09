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
import com.tools20022.repository.choice.DateFormat22Choice;
import com.tools20022.repository.choice.RateFormat6Choice;
import com.tools20022.repository.codeset.ReinvestmentPlan1Code;
import com.tools20022.repository.codeset.TypeOfAmount4Code;
import com.tools20022.repository.codeset.TypeOfDate1Code;
import com.tools20022.repository.codeset.TypeOfDateCode;
import com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.GeneratedRepository;
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
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#mmPlaceAndName
 * DateAndAmountSD1.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#mmFirstSettlementDateOfDeferredTrades
 * DateAndAmountSD1.mmFirstSettlementDateOfDeferredTrades}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#mmTypeOfPaymentDate
 * DateAndAmountSD1.mmTypeOfPaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#mmEquivalentLocalAmountAnnouncementDate
 * DateAndAmountSD1.mmEquivalentLocalAmountAnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#mmTypeOfEquivalentLocalAmountAnnouncementDate
 * DateAndAmountSD1.mmTypeOfEquivalentLocalAmountAnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#mmEquivalentForeignAmountAnnouncementDate
 * DateAndAmountSD1.mmEquivalentForeignAmountAnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#mmTypeOfEquivalentForeignAmountAnnouncementDate
 * DateAndAmountSD1.mmTypeOfEquivalentForeignAmountAnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#mmTypeOfIssueDate
 * DateAndAmountSD1.mmTypeOfIssueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#mmPariPassuFromIssueDateIndicator
 * DateAndAmountSD1.mmPariPassuFromIssueDateIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#mmLodgementOfSecurityHolderResolutionDate
 * DateAndAmountSD1.mmLodgementOfSecurityHolderResolutionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#mmTypeOfLodgementOfSecurityHolderResolutionDate
 * DateAndAmountSD1.mmTypeOfLodgementOfSecurityHolderResolutionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#mmSelectiveReturnOfCapitalIndicator
 * DateAndAmountSD1.mmSelectiveReturnOfCapitalIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#mmSpecialAmountPerSecurityAnnouncementDate
 * DateAndAmountSD1.mmSpecialAmountPerSecurityAnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#mmTypeOfSpecialAmountPerSecurityAnnouncementDate
 * DateAndAmountSD1.mmTypeOfSpecialAmountPerSecurityAnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#mmScripAmountPerSecurityAnnouncementDate
 * DateAndAmountSD1.mmScripAmountPerSecurityAnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#mmTypeOfScripAmountPerSecurityAnnouncementDate
 * DateAndAmountSD1.mmTypeOfScripAmountPerSecurityAnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#mmSupplementaryAmountPerSecurityAnnouncementDate
 * DateAndAmountSD1.mmSupplementaryAmountPerSecurityAnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#mmTypeOfSupplementaryAmountPerSecurityAnnouncementDate
 * DateAndAmountSD1.mmTypeOfSupplementaryAmountPerSecurityAnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#mmAmountPerSecurityAnnouncementDate
 * DateAndAmountSD1.mmAmountPerSecurityAnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#mmTypeOfAmountPerSecurityAnnouncementDate
 * DateAndAmountSD1.mmTypeOfAmountPerSecurityAnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#mmTypeOfGrossDividendRate
 * DateAndAmountSD1.mmTypeOfGrossDividendRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#mmEndDateOfDividendPeriod
 * DateAndAmountSD1.mmEndDateOfDividendPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#mmLastTradingDayForOriginalSecurities
 * DateAndAmountSD1.mmLastTradingDayForOriginalSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#mmEarliestPostConsolidationNotificationDate
 * DateAndAmountSD1.mmEarliestPostConsolidationNotificationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#mmMinimumAmountForParticipation
 * DateAndAmountSD1.mmMinimumAmountForParticipation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#mmMaximumAmountForParticipation
 * DateAndAmountSD1.mmMaximumAmountForParticipation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#mmReinvestmentDiscountRate
 * DateAndAmountSD1.mmReinvestmentDiscountRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DateAndAmountSD1#mmReinvestmentPlanType
 * DateAndAmountSD1.mmReinvestmentPlanType}</li>
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
 * "DateAndAmountSD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Extra dates, amounts and related indicators."</li>
 * </ul>
 */
public class DateAndAmountSD1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text placeAndName;
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
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "Unambiguous reference to the location where the supplementary data must be inserted in the message instance. \r\n\r\nIn the case of XML, this is expressed by a valid XPath.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected DateFormat22Choice firstSettlementDateOfDeferredTrades;
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
	public static final MMMessageAssociationEnd mmFirstSettlementDateOfDeferredTrades = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "FrstSttlmDtOfDfrrdTrds";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstSettlementDateOfDeferredTrades";
			definition = "First settlement of deferred settlement trades and normal T+3 trades.\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat22Choice.mmObject();
		}
	};
	protected TypeOfDate1Code typeOfPaymentDate;
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
	public static final MMMessageAttribute mmTypeOfPaymentDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "TpOfPmtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfPaymentDate";
			definition = "Specifies whether the payment date is estimated or actual.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TypeOfDate1Code.mmObject();
		}
	};
	protected DateFormat22Choice equivalentLocalAmountAnnouncementDate;
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
	public static final MMMessageAssociationEnd mmEquivalentLocalAmountAnnouncementDate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "EqvtLclAmtAnncmntDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EquivalentLocalAmountAnnouncementDate";
			definition = "Date when the equivalent amount in the local currency will be announced.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat22Choice.mmObject();
		}
	};
	protected TypeOfAmount4Code typeOfEquivalentLocalAmountAnnouncementDate;
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
	public static final MMMessageAttribute mmTypeOfEquivalentLocalAmountAnnouncementDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "TpOfEqvtLclAmtAnncmntDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfEquivalentLocalAmountAnnouncementDate";
			definition = "Specifies whether the Equivalent Local Amount Announcement Date is estimated or actual.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TypeOfAmount4Code.mmObject();
		}
	};
	protected DateFormat22Choice equivalentForeignAmountAnnouncementDate;
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
	public static final MMMessageAssociationEnd mmEquivalentForeignAmountAnnouncementDate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "EqvtFrgnAmtAnncmntDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EquivalentForeignAmountAnnouncementDate";
			definition = "Date when the equivalent amount in the foreign currency will be announced.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat22Choice.mmObject();
		}
	};
	protected TypeOfAmount4Code typeOfEquivalentForeignAmountAnnouncementDate;
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
	public static final MMMessageAttribute mmTypeOfEquivalentForeignAmountAnnouncementDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "TpOfEqvtFrgnAmtAnncmntDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfEquivalentForeignAmountAnnouncementDate";
			definition = "Specifies whether the Equivalent Foreign Amount Announcement Date is estimated or actual.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TypeOfAmount4Code.mmObject();
		}
	};
	protected TypeOfDate1Code typeOfIssueDate;
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
	public static final MMMessageAttribute mmTypeOfIssueDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "TpOfIsseDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfIssueDate";
			definition = "Specifies whether the securities issue date is estimated or actual.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TypeOfDate1Code.mmObject();
		}
	};
	protected TrueFalseIndicator pariPassuFromIssueDateIndicator;
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
	public static final MMMessageAttribute mmPariPassuFromIssueDateIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "PrpssFrIsseDtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PariPassuFromIssueDateIndicator";
			definition = "Specifies whether the securities rank pari passu from issue date.\r\nTRUE means yes.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected DateFormat22Choice lodgementOfSecurityHolderResolutionDate;
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
	public static final MMMessageAssociationEnd mmLodgementOfSecurityHolderResolutionDate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "LdgmntOfSctyHldrRsltnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LodgementOfSecurityHolderResolutionDate";
			definition = "Anticipated or actual date of lodgement of security holder resolution approving the capital return with ASIC.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat22Choice.mmObject();
		}
	};
	protected TypeOfDate1Code typeOfLodgementOfSecurityHolderResolutionDate;
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
	public static final MMMessageAttribute mmTypeOfLodgementOfSecurityHolderResolutionDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "TpOfLdgmntOfSctyHldrRsltnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfLodgementOfSecurityHolderResolutionDate";
			definition = "Specifies whether the Lodgement Of Security Holder Resolution Date is estimated or actual.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TypeOfDate1Code.mmObject();
		}
	};
	protected TrueFalseIndicator selectiveReturnOfCapitalIndicator;
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
	public static final MMMessageAttribute mmSelectiveReturnOfCapitalIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "SelctvRtrOfCptlInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelectiveReturnOfCapitalIndicator";
			definition = "Indicator to determine if the capital return is a selective reduction of capital.\r\nTRUE means yes.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected DateFormat22Choice specialAmountPerSecurityAnnouncementDate;
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
	public static final MMMessageAssociationEnd mmSpecialAmountPerSecurityAnnouncementDate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "SpclAmtPerSctyAnncmntDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialAmountPerSecurityAnnouncementDate";
			definition = "Date or approximate date, that actual special dividend will be announced";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat22Choice.mmObject();
		}
	};
	protected TypeOfDateCode typeOfSpecialAmountPerSecurityAnnouncementDate;
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
	public static final MMMessageAttribute mmTypeOfSpecialAmountPerSecurityAnnouncementDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "TpOfSpclAmtPerSctyAnncmntDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfSpecialAmountPerSecurityAnnouncementDate";
			definition = "Specifies whether the Special Amount Per Security Announcement Date is actual or estimated.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TypeOfDateCode.mmObject();
		}
	};
	protected DateFormat22Choice scripAmountPerSecurityAnnouncementDate;
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
	public static final MMMessageAssociationEnd mmScripAmountPerSecurityAnnouncementDate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "ScripAmtPerSctyAnncmntDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripAmountPerSecurityAnnouncementDate";
			definition = "Date or approximate date, that the actual scrip dividend will be announced.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat22Choice.mmObject();
		}
	};
	protected TypeOfDateCode typeOfScripAmountPerSecurityAnnouncementDate;
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
	public static final MMMessageAttribute mmTypeOfScripAmountPerSecurityAnnouncementDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "TpOfScripAmtPerSctyAnncmntDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfScripAmountPerSecurityAnnouncementDate";
			definition = "Specifies whether the Special Amount Per Security Announcement Date is actual or estimated.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TypeOfDateCode.mmObject();
		}
	};
	protected DateFormat22Choice supplementaryAmountPerSecurityAnnouncementDate;
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
	public static final MMMessageAssociationEnd mmSupplementaryAmountPerSecurityAnnouncementDate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "SplmtryAmtPerSctyAnncmntDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryAmountPerSecurityAnnouncementDate";
			definition = "Date or approximate date, that the actual supplementary dividend will be announced.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat22Choice.mmObject();
		}
	};
	protected TypeOfDateCode typeOfSupplementaryAmountPerSecurityAnnouncementDate;
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
	public static final MMMessageAttribute mmTypeOfSupplementaryAmountPerSecurityAnnouncementDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "TpOfSplmtryAmtPerSctyAnncmntDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfSupplementaryAmountPerSecurityAnnouncementDate";
			definition = "Specifies whether the Suppmentary Amount Per Security Announcement Date is actual or estimated.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TypeOfDateCode.mmObject();
		}
	};
	protected DateFormat22Choice amountPerSecurityAnnouncementDate;
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
	public static final MMMessageAssociationEnd mmAmountPerSecurityAnnouncementDate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "AmtPerSctyAnncmntDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountPerSecurityAnnouncementDate";
			definition = "Date or approximate date, that actual ordinary dividend will be announced.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat22Choice.mmObject();
		}
	};
	protected TypeOfDateCode typeOfAmountPerSecurityAnnouncementDate;
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
	public static final MMMessageAttribute mmTypeOfAmountPerSecurityAnnouncementDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "TpOfAmtPerSctyAnncmntDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfAmountPerSecurityAnnouncementDate";
			definition = "Specifies whether the ordinary Amount Per Security Announcement Date is actual or estimated.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TypeOfDateCode.mmObject();
		}
	};
	protected TypeOfAmount4Code typeOfGrossDividendRate;
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
	public static final MMMessageAttribute mmTypeOfGrossDividendRate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "TpOfGrssDvddRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfGrossDividendRate";
			definition = "Specifies whether the Gross Dividend Rate is estimated or actual.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TypeOfAmount4Code.mmObject();
		}
	};
	protected DateFormat22Choice endDateOfDividendPeriod;
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
	public static final MMMessageAssociationEnd mmEndDateOfDividendPeriod = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "EndDtOfDvddPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndDateOfDividendPeriod";
			definition = "Date which marks the end of the period for which the dividend is to be declared.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat22Choice.mmObject();
		}
	};
	protected DateFormat22Choice lastTradingDayForOriginalSecurities;
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
	public static final MMMessageAssociationEnd mmLastTradingDayForOriginalSecurities = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "LastTradgDayForOrgnlScties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastTradingDayForOriginalSecurities";
			definition = "Last day for trading in pre-reorganisation securities. ";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat22Choice.mmObject();
		}
	};
	protected DateFormat22Choice earliestPostConsolidationNotificationDate;
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
	public static final MMMessageAssociationEnd mmEarliestPostConsolidationNotificationDate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "EarlstPstCnsldtnNtfctnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarliestPostConsolidationNotificationDate";
			definition = "First day to send notices to security holders and register securities on a post-reorganisation basis.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat22Choice.mmObject();
		}
	};
	protected ActiveCurrencyAnd13DecimalAmount minimumAmountForParticipation;
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
	public static final MMMessageAttribute mmMinimumAmountForParticipation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "MinAmtForPrtcptn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumAmountForParticipation";
			definition = "Minimum amount for a single securityholder participating in the plan, in the primary currency.\r\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAnd13DecimalAmount.mmObject();
		}
	};
	protected ActiveCurrencyAnd13DecimalAmount maximumAmountForParticipation;
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
	public static final MMMessageAttribute mmMaximumAmountForParticipation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "MaxAmtForPrtcptn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumAmountForParticipation";
			definition = "Maximum amount for a single security holder participating in the plan, in the primary currency.\r\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAnd13DecimalAmount.mmObject();
		}
	};
	protected RateFormat6Choice reinvestmentDiscountRate;
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
	public static final MMMessageAssociationEnd mmReinvestmentDiscountRate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "RinvstmtDscntRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReinvestmentDiscountRate";
			definition = "Percentage discount applied to the weighted average DRP/BSP/Plan issue price calculated as part of the DRP/BSP/Plan.\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateFormat6Choice.mmObject();
		}
	};
	protected ReinvestmentPlan1Code reinvestmentPlanType;
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
	public static final MMMessageAttribute mmReinvestmentPlanType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DateAndAmountSD1.mmObject();
			isDerived = false;
			xmlTag = "RinvstmtPlanTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReinvestmentPlanType";
			definition = "Indicates for whom this reinvestment plan applies.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ReinvestmentPlan1Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(DateAndAmountSD1.mmPlaceAndName, DateAndAmountSD1.mmFirstSettlementDateOfDeferredTrades, DateAndAmountSD1.mmTypeOfPaymentDate,
						DateAndAmountSD1.mmEquivalentLocalAmountAnnouncementDate, DateAndAmountSD1.mmTypeOfEquivalentLocalAmountAnnouncementDate, DateAndAmountSD1.mmEquivalentForeignAmountAnnouncementDate,
						DateAndAmountSD1.mmTypeOfEquivalentForeignAmountAnnouncementDate, DateAndAmountSD1.mmTypeOfIssueDate, DateAndAmountSD1.mmPariPassuFromIssueDateIndicator, DateAndAmountSD1.mmLodgementOfSecurityHolderResolutionDate,
						DateAndAmountSD1.mmTypeOfLodgementOfSecurityHolderResolutionDate, DateAndAmountSD1.mmSelectiveReturnOfCapitalIndicator, DateAndAmountSD1.mmSpecialAmountPerSecurityAnnouncementDate,
						DateAndAmountSD1.mmTypeOfSpecialAmountPerSecurityAnnouncementDate, DateAndAmountSD1.mmScripAmountPerSecurityAnnouncementDate, DateAndAmountSD1.mmTypeOfScripAmountPerSecurityAnnouncementDate,
						DateAndAmountSD1.mmSupplementaryAmountPerSecurityAnnouncementDate, DateAndAmountSD1.mmTypeOfSupplementaryAmountPerSecurityAnnouncementDate, DateAndAmountSD1.mmAmountPerSecurityAnnouncementDate,
						DateAndAmountSD1.mmTypeOfAmountPerSecurityAnnouncementDate, DateAndAmountSD1.mmTypeOfGrossDividendRate, DateAndAmountSD1.mmEndDateOfDividendPeriod, DateAndAmountSD1.mmLastTradingDayForOriginalSecurities,
						DateAndAmountSD1.mmEarliestPostConsolidationNotificationDate, DateAndAmountSD1.mmMinimumAmountForParticipation, DateAndAmountSD1.mmMaximumAmountForParticipation, DateAndAmountSD1.mmReinvestmentDiscountRate,
						DateAndAmountSD1.mmReinvestmentPlanType);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DateAndAmountSD1";
				definition = "Extra dates, amounts and related indicators.";
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

	public DateFormat22Choice getFirstSettlementDateOfDeferredTrades() {
		return firstSettlementDateOfDeferredTrades;
	}

	public void setFirstSettlementDateOfDeferredTrades(DateFormat22Choice firstSettlementDateOfDeferredTrades) {
		this.firstSettlementDateOfDeferredTrades = firstSettlementDateOfDeferredTrades;
	}

	public TypeOfDate1Code getTypeOfPaymentDate() {
		return typeOfPaymentDate;
	}

	public void setTypeOfPaymentDate(TypeOfDate1Code typeOfPaymentDate) {
		this.typeOfPaymentDate = typeOfPaymentDate;
	}

	public DateFormat22Choice getEquivalentLocalAmountAnnouncementDate() {
		return equivalentLocalAmountAnnouncementDate;
	}

	public void setEquivalentLocalAmountAnnouncementDate(DateFormat22Choice equivalentLocalAmountAnnouncementDate) {
		this.equivalentLocalAmountAnnouncementDate = equivalentLocalAmountAnnouncementDate;
	}

	public TypeOfAmount4Code getTypeOfEquivalentLocalAmountAnnouncementDate() {
		return typeOfEquivalentLocalAmountAnnouncementDate;
	}

	public void setTypeOfEquivalentLocalAmountAnnouncementDate(TypeOfAmount4Code typeOfEquivalentLocalAmountAnnouncementDate) {
		this.typeOfEquivalentLocalAmountAnnouncementDate = typeOfEquivalentLocalAmountAnnouncementDate;
	}

	public DateFormat22Choice getEquivalentForeignAmountAnnouncementDate() {
		return equivalentForeignAmountAnnouncementDate;
	}

	public void setEquivalentForeignAmountAnnouncementDate(DateFormat22Choice equivalentForeignAmountAnnouncementDate) {
		this.equivalentForeignAmountAnnouncementDate = equivalentForeignAmountAnnouncementDate;
	}

	public TypeOfAmount4Code getTypeOfEquivalentForeignAmountAnnouncementDate() {
		return typeOfEquivalentForeignAmountAnnouncementDate;
	}

	public void setTypeOfEquivalentForeignAmountAnnouncementDate(TypeOfAmount4Code typeOfEquivalentForeignAmountAnnouncementDate) {
		this.typeOfEquivalentForeignAmountAnnouncementDate = typeOfEquivalentForeignAmountAnnouncementDate;
	}

	public TypeOfDate1Code getTypeOfIssueDate() {
		return typeOfIssueDate;
	}

	public void setTypeOfIssueDate(TypeOfDate1Code typeOfIssueDate) {
		this.typeOfIssueDate = typeOfIssueDate;
	}

	public TrueFalseIndicator getPariPassuFromIssueDateIndicator() {
		return pariPassuFromIssueDateIndicator;
	}

	public void setPariPassuFromIssueDateIndicator(TrueFalseIndicator pariPassuFromIssueDateIndicator) {
		this.pariPassuFromIssueDateIndicator = pariPassuFromIssueDateIndicator;
	}

	public DateFormat22Choice getLodgementOfSecurityHolderResolutionDate() {
		return lodgementOfSecurityHolderResolutionDate;
	}

	public void setLodgementOfSecurityHolderResolutionDate(DateFormat22Choice lodgementOfSecurityHolderResolutionDate) {
		this.lodgementOfSecurityHolderResolutionDate = lodgementOfSecurityHolderResolutionDate;
	}

	public TypeOfDate1Code getTypeOfLodgementOfSecurityHolderResolutionDate() {
		return typeOfLodgementOfSecurityHolderResolutionDate;
	}

	public void setTypeOfLodgementOfSecurityHolderResolutionDate(TypeOfDate1Code typeOfLodgementOfSecurityHolderResolutionDate) {
		this.typeOfLodgementOfSecurityHolderResolutionDate = typeOfLodgementOfSecurityHolderResolutionDate;
	}

	public TrueFalseIndicator getSelectiveReturnOfCapitalIndicator() {
		return selectiveReturnOfCapitalIndicator;
	}

	public void setSelectiveReturnOfCapitalIndicator(TrueFalseIndicator selectiveReturnOfCapitalIndicator) {
		this.selectiveReturnOfCapitalIndicator = selectiveReturnOfCapitalIndicator;
	}

	public DateFormat22Choice getSpecialAmountPerSecurityAnnouncementDate() {
		return specialAmountPerSecurityAnnouncementDate;
	}

	public void setSpecialAmountPerSecurityAnnouncementDate(DateFormat22Choice specialAmountPerSecurityAnnouncementDate) {
		this.specialAmountPerSecurityAnnouncementDate = specialAmountPerSecurityAnnouncementDate;
	}

	public TypeOfDateCode getTypeOfSpecialAmountPerSecurityAnnouncementDate() {
		return typeOfSpecialAmountPerSecurityAnnouncementDate;
	}

	public void setTypeOfSpecialAmountPerSecurityAnnouncementDate(TypeOfDateCode typeOfSpecialAmountPerSecurityAnnouncementDate) {
		this.typeOfSpecialAmountPerSecurityAnnouncementDate = typeOfSpecialAmountPerSecurityAnnouncementDate;
	}

	public DateFormat22Choice getScripAmountPerSecurityAnnouncementDate() {
		return scripAmountPerSecurityAnnouncementDate;
	}

	public void setScripAmountPerSecurityAnnouncementDate(DateFormat22Choice scripAmountPerSecurityAnnouncementDate) {
		this.scripAmountPerSecurityAnnouncementDate = scripAmountPerSecurityAnnouncementDate;
	}

	public TypeOfDateCode getTypeOfScripAmountPerSecurityAnnouncementDate() {
		return typeOfScripAmountPerSecurityAnnouncementDate;
	}

	public void setTypeOfScripAmountPerSecurityAnnouncementDate(TypeOfDateCode typeOfScripAmountPerSecurityAnnouncementDate) {
		this.typeOfScripAmountPerSecurityAnnouncementDate = typeOfScripAmountPerSecurityAnnouncementDate;
	}

	public DateFormat22Choice getSupplementaryAmountPerSecurityAnnouncementDate() {
		return supplementaryAmountPerSecurityAnnouncementDate;
	}

	public void setSupplementaryAmountPerSecurityAnnouncementDate(DateFormat22Choice supplementaryAmountPerSecurityAnnouncementDate) {
		this.supplementaryAmountPerSecurityAnnouncementDate = supplementaryAmountPerSecurityAnnouncementDate;
	}

	public TypeOfDateCode getTypeOfSupplementaryAmountPerSecurityAnnouncementDate() {
		return typeOfSupplementaryAmountPerSecurityAnnouncementDate;
	}

	public void setTypeOfSupplementaryAmountPerSecurityAnnouncementDate(TypeOfDateCode typeOfSupplementaryAmountPerSecurityAnnouncementDate) {
		this.typeOfSupplementaryAmountPerSecurityAnnouncementDate = typeOfSupplementaryAmountPerSecurityAnnouncementDate;
	}

	public DateFormat22Choice getAmountPerSecurityAnnouncementDate() {
		return amountPerSecurityAnnouncementDate;
	}

	public void setAmountPerSecurityAnnouncementDate(DateFormat22Choice amountPerSecurityAnnouncementDate) {
		this.amountPerSecurityAnnouncementDate = amountPerSecurityAnnouncementDate;
	}

	public TypeOfDateCode getTypeOfAmountPerSecurityAnnouncementDate() {
		return typeOfAmountPerSecurityAnnouncementDate;
	}

	public void setTypeOfAmountPerSecurityAnnouncementDate(TypeOfDateCode typeOfAmountPerSecurityAnnouncementDate) {
		this.typeOfAmountPerSecurityAnnouncementDate = typeOfAmountPerSecurityAnnouncementDate;
	}

	public TypeOfAmount4Code getTypeOfGrossDividendRate() {
		return typeOfGrossDividendRate;
	}

	public void setTypeOfGrossDividendRate(TypeOfAmount4Code typeOfGrossDividendRate) {
		this.typeOfGrossDividendRate = typeOfGrossDividendRate;
	}

	public DateFormat22Choice getEndDateOfDividendPeriod() {
		return endDateOfDividendPeriod;
	}

	public void setEndDateOfDividendPeriod(DateFormat22Choice endDateOfDividendPeriod) {
		this.endDateOfDividendPeriod = endDateOfDividendPeriod;
	}

	public DateFormat22Choice getLastTradingDayForOriginalSecurities() {
		return lastTradingDayForOriginalSecurities;
	}

	public void setLastTradingDayForOriginalSecurities(DateFormat22Choice lastTradingDayForOriginalSecurities) {
		this.lastTradingDayForOriginalSecurities = lastTradingDayForOriginalSecurities;
	}

	public DateFormat22Choice getEarliestPostConsolidationNotificationDate() {
		return earliestPostConsolidationNotificationDate;
	}

	public void setEarliestPostConsolidationNotificationDate(DateFormat22Choice earliestPostConsolidationNotificationDate) {
		this.earliestPostConsolidationNotificationDate = earliestPostConsolidationNotificationDate;
	}

	public ActiveCurrencyAnd13DecimalAmount getMinimumAmountForParticipation() {
		return minimumAmountForParticipation;
	}

	public void setMinimumAmountForParticipation(ActiveCurrencyAnd13DecimalAmount minimumAmountForParticipation) {
		this.minimumAmountForParticipation = minimumAmountForParticipation;
	}

	public ActiveCurrencyAnd13DecimalAmount getMaximumAmountForParticipation() {
		return maximumAmountForParticipation;
	}

	public void setMaximumAmountForParticipation(ActiveCurrencyAnd13DecimalAmount maximumAmountForParticipation) {
		this.maximumAmountForParticipation = maximumAmountForParticipation;
	}

	public RateFormat6Choice getReinvestmentDiscountRate() {
		return reinvestmentDiscountRate;
	}

	public void setReinvestmentDiscountRate(RateFormat6Choice reinvestmentDiscountRate) {
		this.reinvestmentDiscountRate = reinvestmentDiscountRate;
	}

	public ReinvestmentPlan1Code getReinvestmentPlanType() {
		return reinvestmentPlanType;
	}

	public void setReinvestmentPlanType(ReinvestmentPlan1Code reinvestmentPlanType) {
		this.reinvestmentPlanType = reinvestmentPlanType;
	}
}