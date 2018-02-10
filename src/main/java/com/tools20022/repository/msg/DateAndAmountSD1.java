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
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DateAndAmountSD1", propOrder = {"placeAndName", "firstSettlementDateOfDeferredTrades", "typeOfPaymentDate", "equivalentLocalAmountAnnouncementDate", "typeOfEquivalentLocalAmountAnnouncementDate",
		"equivalentForeignAmountAnnouncementDate", "typeOfEquivalentForeignAmountAnnouncementDate", "typeOfIssueDate", "pariPassuFromIssueDateIndicator", "lodgementOfSecurityHolderResolutionDate",
		"typeOfLodgementOfSecurityHolderResolutionDate", "selectiveReturnOfCapitalIndicator", "specialAmountPerSecurityAnnouncementDate", "typeOfSpecialAmountPerSecurityAnnouncementDate", "scripAmountPerSecurityAnnouncementDate",
		"typeOfScripAmountPerSecurityAnnouncementDate", "supplementaryAmountPerSecurityAnnouncementDate", "typeOfSupplementaryAmountPerSecurityAnnouncementDate", "amountPerSecurityAnnouncementDate",
		"typeOfAmountPerSecurityAnnouncementDate", "typeOfGrossDividendRate", "endDateOfDividendPeriod", "lastTradingDayForOriginalSecurities", "earliestPostConsolidationNotificationDate", "minimumAmountForParticipation",
		"maximumAmountForParticipation", "reinvestmentDiscountRate", "reinvestmentPlanType"})
public class DateAndAmountSD1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm")
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
			componentContext_lazy = () -> com.tools20022.repository.msg.DateAndAmountSD1.mmObject();
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
	@XmlElement(name = "FrstSttlmDtOfDfrrdTrds")
	protected DateFormat22Choice firstSettlementDateOfDeferredTrades;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.DateAndAmountSD1.mmObject();
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
	@XmlElement(name = "TpOfPmtDt")
	protected TypeOfDate1Code typeOfPaymentDate;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.DateAndAmountSD1.mmObject();
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
	@XmlElement(name = "EqvtLclAmtAnncmntDt")
	protected DateFormat22Choice equivalentLocalAmountAnnouncementDate;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.DateAndAmountSD1.mmObject();
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
	@XmlElement(name = "TpOfEqvtLclAmtAnncmntDt")
	protected TypeOfAmount4Code typeOfEquivalentLocalAmountAnnouncementDate;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.DateAndAmountSD1.mmObject();
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
	@XmlElement(name = "EqvtFrgnAmtAnncmntDt")
	protected DateFormat22Choice equivalentForeignAmountAnnouncementDate;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.DateAndAmountSD1.mmObject();
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
	@XmlElement(name = "TpOfEqvtFrgnAmtAnncmntDt")
	protected TypeOfAmount4Code typeOfEquivalentForeignAmountAnnouncementDate;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.DateAndAmountSD1.mmObject();
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
	@XmlElement(name = "TpOfIsseDt")
	protected TypeOfDate1Code typeOfIssueDate;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.DateAndAmountSD1.mmObject();
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
	@XmlElement(name = "PrpssFrIsseDtInd")
	protected TrueFalseIndicator pariPassuFromIssueDateIndicator;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.DateAndAmountSD1.mmObject();
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
	@XmlElement(name = "LdgmntOfSctyHldrRsltnDt")
	protected DateFormat22Choice lodgementOfSecurityHolderResolutionDate;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.DateAndAmountSD1.mmObject();
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
	@XmlElement(name = "TpOfLdgmntOfSctyHldrRsltnDt")
	protected TypeOfDate1Code typeOfLodgementOfSecurityHolderResolutionDate;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.DateAndAmountSD1.mmObject();
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
	@XmlElement(name = "SelctvRtrOfCptlInd")
	protected TrueFalseIndicator selectiveReturnOfCapitalIndicator;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.DateAndAmountSD1.mmObject();
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
	@XmlElement(name = "SpclAmtPerSctyAnncmntDt")
	protected DateFormat22Choice specialAmountPerSecurityAnnouncementDate;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.DateAndAmountSD1.mmObject();
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
	@XmlElement(name = "TpOfSpclAmtPerSctyAnncmntDt")
	protected TypeOfDateCode typeOfSpecialAmountPerSecurityAnnouncementDate;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.DateAndAmountSD1.mmObject();
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
	@XmlElement(name = "ScripAmtPerSctyAnncmntDt")
	protected DateFormat22Choice scripAmountPerSecurityAnnouncementDate;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.DateAndAmountSD1.mmObject();
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
	@XmlElement(name = "TpOfScripAmtPerSctyAnncmntDt")
	protected TypeOfDateCode typeOfScripAmountPerSecurityAnnouncementDate;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.DateAndAmountSD1.mmObject();
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
	@XmlElement(name = "SplmtryAmtPerSctyAnncmntDt")
	protected DateFormat22Choice supplementaryAmountPerSecurityAnnouncementDate;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.DateAndAmountSD1.mmObject();
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
	@XmlElement(name = "TpOfSplmtryAmtPerSctyAnncmntDt")
	protected TypeOfDateCode typeOfSupplementaryAmountPerSecurityAnnouncementDate;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.DateAndAmountSD1.mmObject();
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
	@XmlElement(name = "AmtPerSctyAnncmntDt")
	protected DateFormat22Choice amountPerSecurityAnnouncementDate;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.DateAndAmountSD1.mmObject();
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
	@XmlElement(name = "TpOfAmtPerSctyAnncmntDt")
	protected TypeOfDateCode typeOfAmountPerSecurityAnnouncementDate;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.DateAndAmountSD1.mmObject();
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
	@XmlElement(name = "TpOfGrssDvddRate")
	protected TypeOfAmount4Code typeOfGrossDividendRate;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.DateAndAmountSD1.mmObject();
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
	@XmlElement(name = "EndDtOfDvddPrd")
	protected DateFormat22Choice endDateOfDividendPeriod;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.DateAndAmountSD1.mmObject();
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
	@XmlElement(name = "LastTradgDayForOrgnlScties")
	protected DateFormat22Choice lastTradingDayForOriginalSecurities;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.DateAndAmountSD1.mmObject();
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
	@XmlElement(name = "EarlstPstCnsldtnNtfctnDt")
	protected DateFormat22Choice earliestPostConsolidationNotificationDate;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.DateAndAmountSD1.mmObject();
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
	@XmlElement(name = "MinAmtForPrtcptn")
	protected ActiveCurrencyAnd13DecimalAmount minimumAmountForParticipation;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.DateAndAmountSD1.mmObject();
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
	@XmlElement(name = "MaxAmtForPrtcptn")
	protected ActiveCurrencyAnd13DecimalAmount maximumAmountForParticipation;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.DateAndAmountSD1.mmObject();
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
	@XmlElement(name = "RinvstmtDscntRate")
	protected RateFormat6Choice reinvestmentDiscountRate;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.DateAndAmountSD1.mmObject();
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
	@XmlElement(name = "RinvstmtPlanTp")
	protected ReinvestmentPlan1Code reinvestmentPlanType;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.DateAndAmountSD1.mmObject();
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
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DateAndAmountSD1.mmPlaceAndName, com.tools20022.repository.msg.DateAndAmountSD1.mmFirstSettlementDateOfDeferredTrades,
						com.tools20022.repository.msg.DateAndAmountSD1.mmTypeOfPaymentDate, com.tools20022.repository.msg.DateAndAmountSD1.mmEquivalentLocalAmountAnnouncementDate,
						com.tools20022.repository.msg.DateAndAmountSD1.mmTypeOfEquivalentLocalAmountAnnouncementDate, com.tools20022.repository.msg.DateAndAmountSD1.mmEquivalentForeignAmountAnnouncementDate,
						com.tools20022.repository.msg.DateAndAmountSD1.mmTypeOfEquivalentForeignAmountAnnouncementDate, com.tools20022.repository.msg.DateAndAmountSD1.mmTypeOfIssueDate,
						com.tools20022.repository.msg.DateAndAmountSD1.mmPariPassuFromIssueDateIndicator, com.tools20022.repository.msg.DateAndAmountSD1.mmLodgementOfSecurityHolderResolutionDate,
						com.tools20022.repository.msg.DateAndAmountSD1.mmTypeOfLodgementOfSecurityHolderResolutionDate, com.tools20022.repository.msg.DateAndAmountSD1.mmSelectiveReturnOfCapitalIndicator,
						com.tools20022.repository.msg.DateAndAmountSD1.mmSpecialAmountPerSecurityAnnouncementDate, com.tools20022.repository.msg.DateAndAmountSD1.mmTypeOfSpecialAmountPerSecurityAnnouncementDate,
						com.tools20022.repository.msg.DateAndAmountSD1.mmScripAmountPerSecurityAnnouncementDate, com.tools20022.repository.msg.DateAndAmountSD1.mmTypeOfScripAmountPerSecurityAnnouncementDate,
						com.tools20022.repository.msg.DateAndAmountSD1.mmSupplementaryAmountPerSecurityAnnouncementDate, com.tools20022.repository.msg.DateAndAmountSD1.mmTypeOfSupplementaryAmountPerSecurityAnnouncementDate,
						com.tools20022.repository.msg.DateAndAmountSD1.mmAmountPerSecurityAnnouncementDate, com.tools20022.repository.msg.DateAndAmountSD1.mmTypeOfAmountPerSecurityAnnouncementDate,
						com.tools20022.repository.msg.DateAndAmountSD1.mmTypeOfGrossDividendRate, com.tools20022.repository.msg.DateAndAmountSD1.mmEndDateOfDividendPeriod,
						com.tools20022.repository.msg.DateAndAmountSD1.mmLastTradingDayForOriginalSecurities, com.tools20022.repository.msg.DateAndAmountSD1.mmEarliestPostConsolidationNotificationDate,
						com.tools20022.repository.msg.DateAndAmountSD1.mmMinimumAmountForParticipation, com.tools20022.repository.msg.DateAndAmountSD1.mmMaximumAmountForParticipation,
						com.tools20022.repository.msg.DateAndAmountSD1.mmReinvestmentDiscountRate, com.tools20022.repository.msg.DateAndAmountSD1.mmReinvestmentPlanType);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DateAndAmountSD1";
				definition = "Extra dates, amounts and related indicators.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max350Text> getPlaceAndName() {
		return placeAndName == null ? Optional.empty() : Optional.of(placeAndName);
	}

	public DateAndAmountSD1 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
		return this;
	}

	public Optional<DateFormat22Choice> getFirstSettlementDateOfDeferredTrades() {
		return firstSettlementDateOfDeferredTrades == null ? Optional.empty() : Optional.of(firstSettlementDateOfDeferredTrades);
	}

	public DateAndAmountSD1 setFirstSettlementDateOfDeferredTrades(DateFormat22Choice firstSettlementDateOfDeferredTrades) {
		this.firstSettlementDateOfDeferredTrades = firstSettlementDateOfDeferredTrades;
		return this;
	}

	public Optional<TypeOfDate1Code> getTypeOfPaymentDate() {
		return typeOfPaymentDate == null ? Optional.empty() : Optional.of(typeOfPaymentDate);
	}

	public DateAndAmountSD1 setTypeOfPaymentDate(TypeOfDate1Code typeOfPaymentDate) {
		this.typeOfPaymentDate = typeOfPaymentDate;
		return this;
	}

	public Optional<DateFormat22Choice> getEquivalentLocalAmountAnnouncementDate() {
		return equivalentLocalAmountAnnouncementDate == null ? Optional.empty() : Optional.of(equivalentLocalAmountAnnouncementDate);
	}

	public DateAndAmountSD1 setEquivalentLocalAmountAnnouncementDate(DateFormat22Choice equivalentLocalAmountAnnouncementDate) {
		this.equivalentLocalAmountAnnouncementDate = equivalentLocalAmountAnnouncementDate;
		return this;
	}

	public Optional<TypeOfAmount4Code> getTypeOfEquivalentLocalAmountAnnouncementDate() {
		return typeOfEquivalentLocalAmountAnnouncementDate == null ? Optional.empty() : Optional.of(typeOfEquivalentLocalAmountAnnouncementDate);
	}

	public DateAndAmountSD1 setTypeOfEquivalentLocalAmountAnnouncementDate(TypeOfAmount4Code typeOfEquivalentLocalAmountAnnouncementDate) {
		this.typeOfEquivalentLocalAmountAnnouncementDate = typeOfEquivalentLocalAmountAnnouncementDate;
		return this;
	}

	public Optional<DateFormat22Choice> getEquivalentForeignAmountAnnouncementDate() {
		return equivalentForeignAmountAnnouncementDate == null ? Optional.empty() : Optional.of(equivalentForeignAmountAnnouncementDate);
	}

	public DateAndAmountSD1 setEquivalentForeignAmountAnnouncementDate(DateFormat22Choice equivalentForeignAmountAnnouncementDate) {
		this.equivalentForeignAmountAnnouncementDate = equivalentForeignAmountAnnouncementDate;
		return this;
	}

	public Optional<TypeOfAmount4Code> getTypeOfEquivalentForeignAmountAnnouncementDate() {
		return typeOfEquivalentForeignAmountAnnouncementDate == null ? Optional.empty() : Optional.of(typeOfEquivalentForeignAmountAnnouncementDate);
	}

	public DateAndAmountSD1 setTypeOfEquivalentForeignAmountAnnouncementDate(TypeOfAmount4Code typeOfEquivalentForeignAmountAnnouncementDate) {
		this.typeOfEquivalentForeignAmountAnnouncementDate = typeOfEquivalentForeignAmountAnnouncementDate;
		return this;
	}

	public Optional<TypeOfDate1Code> getTypeOfIssueDate() {
		return typeOfIssueDate == null ? Optional.empty() : Optional.of(typeOfIssueDate);
	}

	public DateAndAmountSD1 setTypeOfIssueDate(TypeOfDate1Code typeOfIssueDate) {
		this.typeOfIssueDate = typeOfIssueDate;
		return this;
	}

	public Optional<TrueFalseIndicator> getPariPassuFromIssueDateIndicator() {
		return pariPassuFromIssueDateIndicator == null ? Optional.empty() : Optional.of(pariPassuFromIssueDateIndicator);
	}

	public DateAndAmountSD1 setPariPassuFromIssueDateIndicator(TrueFalseIndicator pariPassuFromIssueDateIndicator) {
		this.pariPassuFromIssueDateIndicator = pariPassuFromIssueDateIndicator;
		return this;
	}

	public Optional<DateFormat22Choice> getLodgementOfSecurityHolderResolutionDate() {
		return lodgementOfSecurityHolderResolutionDate == null ? Optional.empty() : Optional.of(lodgementOfSecurityHolderResolutionDate);
	}

	public DateAndAmountSD1 setLodgementOfSecurityHolderResolutionDate(DateFormat22Choice lodgementOfSecurityHolderResolutionDate) {
		this.lodgementOfSecurityHolderResolutionDate = lodgementOfSecurityHolderResolutionDate;
		return this;
	}

	public Optional<TypeOfDate1Code> getTypeOfLodgementOfSecurityHolderResolutionDate() {
		return typeOfLodgementOfSecurityHolderResolutionDate == null ? Optional.empty() : Optional.of(typeOfLodgementOfSecurityHolderResolutionDate);
	}

	public DateAndAmountSD1 setTypeOfLodgementOfSecurityHolderResolutionDate(TypeOfDate1Code typeOfLodgementOfSecurityHolderResolutionDate) {
		this.typeOfLodgementOfSecurityHolderResolutionDate = typeOfLodgementOfSecurityHolderResolutionDate;
		return this;
	}

	public Optional<TrueFalseIndicator> getSelectiveReturnOfCapitalIndicator() {
		return selectiveReturnOfCapitalIndicator == null ? Optional.empty() : Optional.of(selectiveReturnOfCapitalIndicator);
	}

	public DateAndAmountSD1 setSelectiveReturnOfCapitalIndicator(TrueFalseIndicator selectiveReturnOfCapitalIndicator) {
		this.selectiveReturnOfCapitalIndicator = selectiveReturnOfCapitalIndicator;
		return this;
	}

	public Optional<DateFormat22Choice> getSpecialAmountPerSecurityAnnouncementDate() {
		return specialAmountPerSecurityAnnouncementDate == null ? Optional.empty() : Optional.of(specialAmountPerSecurityAnnouncementDate);
	}

	public DateAndAmountSD1 setSpecialAmountPerSecurityAnnouncementDate(DateFormat22Choice specialAmountPerSecurityAnnouncementDate) {
		this.specialAmountPerSecurityAnnouncementDate = specialAmountPerSecurityAnnouncementDate;
		return this;
	}

	public Optional<TypeOfDateCode> getTypeOfSpecialAmountPerSecurityAnnouncementDate() {
		return typeOfSpecialAmountPerSecurityAnnouncementDate == null ? Optional.empty() : Optional.of(typeOfSpecialAmountPerSecurityAnnouncementDate);
	}

	public DateAndAmountSD1 setTypeOfSpecialAmountPerSecurityAnnouncementDate(TypeOfDateCode typeOfSpecialAmountPerSecurityAnnouncementDate) {
		this.typeOfSpecialAmountPerSecurityAnnouncementDate = typeOfSpecialAmountPerSecurityAnnouncementDate;
		return this;
	}

	public Optional<DateFormat22Choice> getScripAmountPerSecurityAnnouncementDate() {
		return scripAmountPerSecurityAnnouncementDate == null ? Optional.empty() : Optional.of(scripAmountPerSecurityAnnouncementDate);
	}

	public DateAndAmountSD1 setScripAmountPerSecurityAnnouncementDate(DateFormat22Choice scripAmountPerSecurityAnnouncementDate) {
		this.scripAmountPerSecurityAnnouncementDate = scripAmountPerSecurityAnnouncementDate;
		return this;
	}

	public Optional<TypeOfDateCode> getTypeOfScripAmountPerSecurityAnnouncementDate() {
		return typeOfScripAmountPerSecurityAnnouncementDate == null ? Optional.empty() : Optional.of(typeOfScripAmountPerSecurityAnnouncementDate);
	}

	public DateAndAmountSD1 setTypeOfScripAmountPerSecurityAnnouncementDate(TypeOfDateCode typeOfScripAmountPerSecurityAnnouncementDate) {
		this.typeOfScripAmountPerSecurityAnnouncementDate = typeOfScripAmountPerSecurityAnnouncementDate;
		return this;
	}

	public Optional<DateFormat22Choice> getSupplementaryAmountPerSecurityAnnouncementDate() {
		return supplementaryAmountPerSecurityAnnouncementDate == null ? Optional.empty() : Optional.of(supplementaryAmountPerSecurityAnnouncementDate);
	}

	public DateAndAmountSD1 setSupplementaryAmountPerSecurityAnnouncementDate(DateFormat22Choice supplementaryAmountPerSecurityAnnouncementDate) {
		this.supplementaryAmountPerSecurityAnnouncementDate = supplementaryAmountPerSecurityAnnouncementDate;
		return this;
	}

	public Optional<TypeOfDateCode> getTypeOfSupplementaryAmountPerSecurityAnnouncementDate() {
		return typeOfSupplementaryAmountPerSecurityAnnouncementDate == null ? Optional.empty() : Optional.of(typeOfSupplementaryAmountPerSecurityAnnouncementDate);
	}

	public DateAndAmountSD1 setTypeOfSupplementaryAmountPerSecurityAnnouncementDate(TypeOfDateCode typeOfSupplementaryAmountPerSecurityAnnouncementDate) {
		this.typeOfSupplementaryAmountPerSecurityAnnouncementDate = typeOfSupplementaryAmountPerSecurityAnnouncementDate;
		return this;
	}

	public Optional<DateFormat22Choice> getAmountPerSecurityAnnouncementDate() {
		return amountPerSecurityAnnouncementDate == null ? Optional.empty() : Optional.of(amountPerSecurityAnnouncementDate);
	}

	public DateAndAmountSD1 setAmountPerSecurityAnnouncementDate(DateFormat22Choice amountPerSecurityAnnouncementDate) {
		this.amountPerSecurityAnnouncementDate = amountPerSecurityAnnouncementDate;
		return this;
	}

	public Optional<TypeOfDateCode> getTypeOfAmountPerSecurityAnnouncementDate() {
		return typeOfAmountPerSecurityAnnouncementDate == null ? Optional.empty() : Optional.of(typeOfAmountPerSecurityAnnouncementDate);
	}

	public DateAndAmountSD1 setTypeOfAmountPerSecurityAnnouncementDate(TypeOfDateCode typeOfAmountPerSecurityAnnouncementDate) {
		this.typeOfAmountPerSecurityAnnouncementDate = typeOfAmountPerSecurityAnnouncementDate;
		return this;
	}

	public Optional<TypeOfAmount4Code> getTypeOfGrossDividendRate() {
		return typeOfGrossDividendRate == null ? Optional.empty() : Optional.of(typeOfGrossDividendRate);
	}

	public DateAndAmountSD1 setTypeOfGrossDividendRate(TypeOfAmount4Code typeOfGrossDividendRate) {
		this.typeOfGrossDividendRate = typeOfGrossDividendRate;
		return this;
	}

	public Optional<DateFormat22Choice> getEndDateOfDividendPeriod() {
		return endDateOfDividendPeriod == null ? Optional.empty() : Optional.of(endDateOfDividendPeriod);
	}

	public DateAndAmountSD1 setEndDateOfDividendPeriod(DateFormat22Choice endDateOfDividendPeriod) {
		this.endDateOfDividendPeriod = endDateOfDividendPeriod;
		return this;
	}

	public Optional<DateFormat22Choice> getLastTradingDayForOriginalSecurities() {
		return lastTradingDayForOriginalSecurities == null ? Optional.empty() : Optional.of(lastTradingDayForOriginalSecurities);
	}

	public DateAndAmountSD1 setLastTradingDayForOriginalSecurities(DateFormat22Choice lastTradingDayForOriginalSecurities) {
		this.lastTradingDayForOriginalSecurities = lastTradingDayForOriginalSecurities;
		return this;
	}

	public Optional<DateFormat22Choice> getEarliestPostConsolidationNotificationDate() {
		return earliestPostConsolidationNotificationDate == null ? Optional.empty() : Optional.of(earliestPostConsolidationNotificationDate);
	}

	public DateAndAmountSD1 setEarliestPostConsolidationNotificationDate(DateFormat22Choice earliestPostConsolidationNotificationDate) {
		this.earliestPostConsolidationNotificationDate = earliestPostConsolidationNotificationDate;
		return this;
	}

	public Optional<ActiveCurrencyAnd13DecimalAmount> getMinimumAmountForParticipation() {
		return minimumAmountForParticipation == null ? Optional.empty() : Optional.of(minimumAmountForParticipation);
	}

	public DateAndAmountSD1 setMinimumAmountForParticipation(ActiveCurrencyAnd13DecimalAmount minimumAmountForParticipation) {
		this.minimumAmountForParticipation = minimumAmountForParticipation;
		return this;
	}

	public Optional<ActiveCurrencyAnd13DecimalAmount> getMaximumAmountForParticipation() {
		return maximumAmountForParticipation == null ? Optional.empty() : Optional.of(maximumAmountForParticipation);
	}

	public DateAndAmountSD1 setMaximumAmountForParticipation(ActiveCurrencyAnd13DecimalAmount maximumAmountForParticipation) {
		this.maximumAmountForParticipation = maximumAmountForParticipation;
		return this;
	}

	public Optional<RateFormat6Choice> getReinvestmentDiscountRate() {
		return reinvestmentDiscountRate == null ? Optional.empty() : Optional.of(reinvestmentDiscountRate);
	}

	public DateAndAmountSD1 setReinvestmentDiscountRate(RateFormat6Choice reinvestmentDiscountRate) {
		this.reinvestmentDiscountRate = reinvestmentDiscountRate;
		return this;
	}

	public Optional<ReinvestmentPlan1Code> getReinvestmentPlanType() {
		return reinvestmentPlanType == null ? Optional.empty() : Optional.of(reinvestmentPlanType);
	}

	public DateAndAmountSD1 setReinvestmentPlanType(ReinvestmentPlan1Code reinvestmentPlanType) {
		this.reinvestmentPlanType = reinvestmentPlanType;
		return this;
	}
}