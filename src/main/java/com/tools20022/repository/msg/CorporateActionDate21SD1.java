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
import com.tools20022.repository.datatype.Max350Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Extension to cater for specific corporate action dates.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21SD1#PlaceAndName
 * CorporateActionDate21SD1.PlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21SD1#WebServiceNotificationDate
 * CorporateActionDate21SD1.WebServiceNotificationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21SD1#PreviousWebServiceNotificationDate
 * CorporateActionDate21SD1.PreviousWebServiceNotificationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21SD1#ActualRecordDate
 * CorporateActionDate21SD1.ActualRecordDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21SD1#BoardMeetingDate
 * CorporateActionDate21SD1.BoardMeetingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21SD1#CorporateRegistrationDate
 * CorporateActionDate21SD1.CorporateRegistrationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21SD1#EarliestPlannedDateOfIssuePrice
 * CorporateActionDate21SD1.EarliestPlannedDateOfIssuePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21SD1#LatestPlannedDateOfIssuePrice
 * CorporateActionDate21SD1.LatestPlannedDateOfIssuePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21SD1#DateOfIssuePrice
 * CorporateActionDate21SD1.DateOfIssuePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21SD1#EarliestPlannedSubscriptionCostPaymentDate
 * CorporateActionDate21SD1.EarliestPlannedSubscriptionCostPaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21SD1#LatestPlannedSubscriptionCostPaymentDate
 * CorporateActionDate21SD1.LatestPlannedSubscriptionCostPaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21SD1#SubsequentListingDate
 * CorporateActionDate21SD1.SubsequentListingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21SD1#NewShareUnitQuantityEffectiveDate
 * CorporateActionDate21SD1.NewShareUnitQuantityEffectiveDate}</li>
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
 * "CorporateActionDate21SD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Extension to cater for specific corporate action dates."</li>
 * </ul>
 */
public class CorporateActionDate21SD1 {

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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21SD1
	 * CorporateActionDate21SD1}</li>
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
			componentContext_lazy = () -> CorporateActionDate21SD1.mmObject();
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
	 * Date and time of notification via web service as reference information.<br>
	 * 通知日時 Notification date and time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat22Choice
	 * DateFormat22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21SD1
	 * CorporateActionDate21SD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WebSvcNtfctnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WebServiceNotificationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time of notification via web service as reference information.\r\n通知日時  Notification date and time."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute WebServiceNotificationDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDate21SD1.mmObject();
			isDerived = false;
			xmlTag = "WebSvcNtfctnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WebServiceNotificationDate";
			definition = "Date and time of notification via web service as reference information.\r\n通知日時  Notification date and time.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> DateFormat22Choice.mmObject();
		}
	};
	/**
	 * Date and time of previous notification via web service as a reference
	 * information (in case of replacement). <br>
	 * 訂正（削除）前通知日時
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat22Choice
	 * DateFormat22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21SD1
	 * CorporateActionDate21SD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsWebSvcNtfctnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousWebServiceNotificationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time of previous notification via web service as a reference information (in case of replacement). \r\n訂正（削除）前通知日時"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute PreviousWebServiceNotificationDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDate21SD1.mmObject();
			isDerived = false;
			xmlTag = "PrvsWebSvcNtfctnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousWebServiceNotificationDate";
			definition = "Date and time of previous notification via web service as a reference information (in case of replacement). \r\n訂正（削除）前通知日時";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> DateFormat22Choice.mmObject();
		}
	};
	/**
	 * Actual record date - the previous business day of the record date if the
	 * record date falls to Saturday, Sunday or national holiday.<br>
	 * 権利確定日
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat22Choice
	 * DateFormat22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21SD1
	 * CorporateActionDate21SD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActlRcrdDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualRecordDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Actual record date - the previous business day of the record date if the record date falls to Saturday, Sunday or national holiday.\r\n権利確定日"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute ActualRecordDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDate21SD1.mmObject();
			isDerived = false;
			xmlTag = "ActlRcrdDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualRecordDate";
			definition = "Actual record date - the previous business day of the record date if the record date falls to Saturday, Sunday or national holiday.\r\n権利確定日";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> DateFormat22Choice.mmObject();
		}
	};
	/**
	 * Date of the board meeting.<br>
	 * 取締役会決議日
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat22Choice
	 * DateFormat22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21SD1
	 * CorporateActionDate21SD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BrdMtgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BoardMeetingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of the board meeting.\r\n取締役会決議日"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute BoardMeetingDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDate21SD1.mmObject();
			isDerived = false;
			xmlTag = "BrdMtgDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BoardMeetingDate";
			definition = "Date of the board meeting.\r\n取締役会決議日";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> DateFormat22Choice.mmObject();
		}
	};
	/**
	 * Date on which the new company will be registered.<br>
	 * 新設会社登記日
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat22Choice
	 * DateFormat22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21SD1
	 * CorporateActionDate21SD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpRegnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateRegistrationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the new company will be registered.\r\n新設会社登記日"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute CorporateRegistrationDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDate21SD1.mmObject();
			isDerived = false;
			xmlTag = "CorpRegnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateRegistrationDate";
			definition = "Date on which the new company will be registered.\r\n新設会社登記日";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> DateFormat22Choice.mmObject();
		}
	};
	/**
	 * Earliest planned date on which the issue price will be set.<br>
	 * 発行価格決定予定日（最短）
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat22Choice
	 * DateFormat22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21SD1
	 * CorporateActionDate21SD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EarlstPlandDtOfIssePric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarliestPlannedDateOfIssuePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Earliest planned date on which the issue price will be set.\r\n発行価格決定予定日（最短）"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute EarliestPlannedDateOfIssuePrice = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDate21SD1.mmObject();
			isDerived = false;
			xmlTag = "EarlstPlandDtOfIssePric";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarliestPlannedDateOfIssuePrice";
			definition = "Earliest planned date on which the issue price will be set.\r\n発行価格決定予定日（最短）";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> DateFormat22Choice.mmObject();
		}
	};
	/**
	 * Latest planned date on which the issue price will be set.<br>
	 * 発行価格決定予定日（最長）
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat22Choice
	 * DateFormat22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21SD1
	 * CorporateActionDate21SD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LatstPlandDtOfIssePric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LatestPlannedDateOfIssuePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Latest planned date on which the issue price will be set.\r\n発行価格決定予定日（最長）"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute LatestPlannedDateOfIssuePrice = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDate21SD1.mmObject();
			isDerived = false;
			xmlTag = "LatstPlandDtOfIssePric";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LatestPlannedDateOfIssuePrice";
			definition = "Latest planned date on which the issue price will be set.\r\n発行価格決定予定日（最長）";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> DateFormat22Choice.mmObject();
		}
	};
	/**
	 * Date on which the issue price will be set.<br>
	 * 発行価格決定日
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat22Choice
	 * DateFormat22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21SD1
	 * CorporateActionDate21SD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtOfIssePric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateOfIssuePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the issue price will be set.\r\n発行価格決定日"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute DateOfIssuePrice = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDate21SD1.mmObject();
			isDerived = false;
			xmlTag = "DtOfIssePric";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateOfIssuePrice";
			definition = "Date on which the issue price will be set.\r\n発行価格決定日";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> DateFormat22Choice.mmObject();
		}
	};
	/**
	 * Earliest planned date on which the cash payment (for the subscription
	 * cost) will be made.<br>
	 * 払込期日予定日（最短）
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat22Choice
	 * DateFormat22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21SD1
	 * CorporateActionDate21SD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EarlstPlandSbcptCostPmtDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarliestPlannedSubscriptionCostPaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Earliest planned date on which the cash payment (for the subscription cost) will be made.\r\n払込期日予定日（最短）"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute EarliestPlannedSubscriptionCostPaymentDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDate21SD1.mmObject();
			isDerived = false;
			xmlTag = "EarlstPlandSbcptCostPmtDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarliestPlannedSubscriptionCostPaymentDate";
			definition = "Earliest planned date on which the cash payment (for the subscription cost) will be made.\r\n払込期日予定日（最短）";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> DateFormat22Choice.mmObject();
		}
	};
	/**
	 * Latest planned date on which the cash payment (for the subscription cost)
	 * will be made.<br>
	 * 払込期日予定日（最長）
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat22Choice
	 * DateFormat22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21SD1
	 * CorporateActionDate21SD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LatstPlandSbcptCostPmtDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LatestPlannedSubscriptionCostPaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Latest planned date on which the cash payment (for the subscription cost) will be made.\r\n払込期日予定日（最長）"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute LatestPlannedSubscriptionCostPaymentDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDate21SD1.mmObject();
			isDerived = false;
			xmlTag = "LatstPlandSbcptCostPmtDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LatestPlannedSubscriptionCostPaymentDate";
			definition = "Latest planned date on which the cash payment (for the subscription cost) will be made.\r\n払込期日予定日（最長）";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> DateFormat22Choice.mmObject();
		}
	};
	/**
	 * Listing date of the new shares announced by Stock Exchange.<br>
	 * 変更上場日
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat22Choice
	 * DateFormat22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21SD1
	 * CorporateActionDate21SD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SbsqntListgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubsequentListingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Listing date of the new shares announced by Stock Exchange.\r\n変更上場日"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute SubsequentListingDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDate21SD1.mmObject();
			isDerived = false;
			xmlTag = "SbsqntListgDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubsequentListingDate";
			definition = "Listing date of the new shares announced by Stock Exchange.\r\n変更上場日";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> DateFormat22Choice.mmObject();
		}
	};
	/**
	 * Date at which the new share unit quantity becomes effective.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat22Choice
	 * DateFormat22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21SD1
	 * CorporateActionDate21SD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewShrUnitQtyFctvDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewShareUnitQuantityEffectiveDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which the new share unit quantity becomes effective."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd NewShareUnitQuantityEffectiveDate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionDate21SD1.mmObject();
			isDerived = false;
			xmlTag = "NewShrUnitQtyFctvDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewShareUnitQuantityEffectiveDate";
			definition = "Date at which the new share unit quantity becomes effective.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> DateFormat22Choice.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate21SD1.PlaceAndName, com.tools20022.repository.msg.CorporateActionDate21SD1.WebServiceNotificationDate,
						com.tools20022.repository.msg.CorporateActionDate21SD1.PreviousWebServiceNotificationDate, com.tools20022.repository.msg.CorporateActionDate21SD1.ActualRecordDate,
						com.tools20022.repository.msg.CorporateActionDate21SD1.BoardMeetingDate, com.tools20022.repository.msg.CorporateActionDate21SD1.CorporateRegistrationDate,
						com.tools20022.repository.msg.CorporateActionDate21SD1.EarliestPlannedDateOfIssuePrice, com.tools20022.repository.msg.CorporateActionDate21SD1.LatestPlannedDateOfIssuePrice,
						com.tools20022.repository.msg.CorporateActionDate21SD1.DateOfIssuePrice, com.tools20022.repository.msg.CorporateActionDate21SD1.EarliestPlannedSubscriptionCostPaymentDate,
						com.tools20022.repository.msg.CorporateActionDate21SD1.LatestPlannedSubscriptionCostPaymentDate, com.tools20022.repository.msg.CorporateActionDate21SD1.SubsequentListingDate,
						com.tools20022.repository.msg.CorporateActionDate21SD1.NewShareUnitQuantityEffectiveDate);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionDate21SD1";
				definition = "Extension to cater for specific corporate action dates.";
			}
		});
		return mmObject_lazy.get();
	}
}