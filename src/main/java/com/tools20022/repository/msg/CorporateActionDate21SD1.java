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
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21SD1#mmPlaceAndName
 * CorporateActionDate21SD1.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21SD1#mmWebServiceNotificationDate
 * CorporateActionDate21SD1.mmWebServiceNotificationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21SD1#mmPreviousWebServiceNotificationDate
 * CorporateActionDate21SD1.mmPreviousWebServiceNotificationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21SD1#mmActualRecordDate
 * CorporateActionDate21SD1.mmActualRecordDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21SD1#mmBoardMeetingDate
 * CorporateActionDate21SD1.mmBoardMeetingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21SD1#mmCorporateRegistrationDate
 * CorporateActionDate21SD1.mmCorporateRegistrationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21SD1#mmEarliestPlannedDateOfIssuePrice
 * CorporateActionDate21SD1.mmEarliestPlannedDateOfIssuePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21SD1#mmLatestPlannedDateOfIssuePrice
 * CorporateActionDate21SD1.mmLatestPlannedDateOfIssuePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21SD1#mmDateOfIssuePrice
 * CorporateActionDate21SD1.mmDateOfIssuePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21SD1#mmEarliestPlannedSubscriptionCostPaymentDate
 * CorporateActionDate21SD1.mmEarliestPlannedSubscriptionCostPaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21SD1#mmLatestPlannedSubscriptionCostPaymentDate
 * CorporateActionDate21SD1.mmLatestPlannedSubscriptionCostPaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21SD1#mmSubsequentListingDate
 * CorporateActionDate21SD1.mmSubsequentListingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21SD1#mmNewShareUnitQuantityEffectiveDate
 * CorporateActionDate21SD1.mmNewShareUnitQuantityEffectiveDate}</li>
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
 * "CorporateActionDate21SD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Extension to cater for specific corporate action dates."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionDate21SD1", propOrder = {"placeAndName", "webServiceNotificationDate", "previousWebServiceNotificationDate", "actualRecordDate", "boardMeetingDate", "corporateRegistrationDate",
		"earliestPlannedDateOfIssuePrice", "latestPlannedDateOfIssuePrice", "dateOfIssuePrice", "earliestPlannedSubscriptionCostPaymentDate", "latestPlannedSubscriptionCostPaymentDate", "subsequentListingDate",
		"newShareUnitQuantityEffectiveDate"})
public class CorporateActionDate21SD1 {

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
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDate21SD1.mmObject();
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
	protected DateFormat22Choice webServiceNotificationDate;
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
	public static final MMMessageAttribute mmWebServiceNotificationDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDate21SD1.mmObject();
			isDerived = false;
			xmlTag = "WebSvcNtfctnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WebServiceNotificationDate";
			definition = "Date and time of notification via web service as reference information.\r\n通知日時  Notification date and time.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat22Choice.mmObject();
		}
	};
	protected DateFormat22Choice previousWebServiceNotificationDate;
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
	public static final MMMessageAttribute mmPreviousWebServiceNotificationDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDate21SD1.mmObject();
			isDerived = false;
			xmlTag = "PrvsWebSvcNtfctnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousWebServiceNotificationDate";
			definition = "Date and time of previous notification via web service as a reference information (in case of replacement). \r\n訂正（削除）前通知日時";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat22Choice.mmObject();
		}
	};
	protected DateFormat22Choice actualRecordDate;
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
	public static final MMMessageAttribute mmActualRecordDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDate21SD1.mmObject();
			isDerived = false;
			xmlTag = "ActlRcrdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualRecordDate";
			definition = "Actual record date - the previous business day of the record date if the record date falls to Saturday, Sunday or national holiday.\r\n権利確定日";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat22Choice.mmObject();
		}
	};
	protected DateFormat22Choice boardMeetingDate;
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
	public static final MMMessageAttribute mmBoardMeetingDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDate21SD1.mmObject();
			isDerived = false;
			xmlTag = "BrdMtgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BoardMeetingDate";
			definition = "Date of the board meeting.\r\n取締役会決議日";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat22Choice.mmObject();
		}
	};
	protected DateFormat22Choice corporateRegistrationDate;
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
	public static final MMMessageAttribute mmCorporateRegistrationDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDate21SD1.mmObject();
			isDerived = false;
			xmlTag = "CorpRegnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateRegistrationDate";
			definition = "Date on which the new company will be registered.\r\n新設会社登記日";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat22Choice.mmObject();
		}
	};
	protected DateFormat22Choice earliestPlannedDateOfIssuePrice;
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
	public static final MMMessageAttribute mmEarliestPlannedDateOfIssuePrice = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDate21SD1.mmObject();
			isDerived = false;
			xmlTag = "EarlstPlandDtOfIssePric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarliestPlannedDateOfIssuePrice";
			definition = "Earliest planned date on which the issue price will be set.\r\n発行価格決定予定日（最短）";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat22Choice.mmObject();
		}
	};
	protected DateFormat22Choice latestPlannedDateOfIssuePrice;
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
	public static final MMMessageAttribute mmLatestPlannedDateOfIssuePrice = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDate21SD1.mmObject();
			isDerived = false;
			xmlTag = "LatstPlandDtOfIssePric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LatestPlannedDateOfIssuePrice";
			definition = "Latest planned date on which the issue price will be set.\r\n発行価格決定予定日（最長）";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat22Choice.mmObject();
		}
	};
	protected DateFormat22Choice dateOfIssuePrice;
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
	public static final MMMessageAttribute mmDateOfIssuePrice = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDate21SD1.mmObject();
			isDerived = false;
			xmlTag = "DtOfIssePric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateOfIssuePrice";
			definition = "Date on which the issue price will be set.\r\n発行価格決定日";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat22Choice.mmObject();
		}
	};
	protected DateFormat22Choice earliestPlannedSubscriptionCostPaymentDate;
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
	public static final MMMessageAttribute mmEarliestPlannedSubscriptionCostPaymentDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDate21SD1.mmObject();
			isDerived = false;
			xmlTag = "EarlstPlandSbcptCostPmtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarliestPlannedSubscriptionCostPaymentDate";
			definition = "Earliest planned date on which the cash payment (for the subscription cost) will be made.\r\n払込期日予定日（最短）";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat22Choice.mmObject();
		}
	};
	protected DateFormat22Choice latestPlannedSubscriptionCostPaymentDate;
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
	public static final MMMessageAttribute mmLatestPlannedSubscriptionCostPaymentDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDate21SD1.mmObject();
			isDerived = false;
			xmlTag = "LatstPlandSbcptCostPmtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LatestPlannedSubscriptionCostPaymentDate";
			definition = "Latest planned date on which the cash payment (for the subscription cost) will be made.\r\n払込期日予定日（最長）";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat22Choice.mmObject();
		}
	};
	protected DateFormat22Choice subsequentListingDate;
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
	public static final MMMessageAttribute mmSubsequentListingDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDate21SD1.mmObject();
			isDerived = false;
			xmlTag = "SbsqntListgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubsequentListingDate";
			definition = "Listing date of the new shares announced by Stock Exchange.\r\n変更上場日";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat22Choice.mmObject();
		}
	};
	protected DateFormat22Choice newShareUnitQuantityEffectiveDate;
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
	public static final MMMessageAssociationEnd mmNewShareUnitQuantityEffectiveDate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionDate21SD1.mmObject();
			isDerived = false;
			xmlTag = "NewShrUnitQtyFctvDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewShareUnitQuantityEffectiveDate";
			definition = "Date at which the new share unit quantity becomes effective.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat22Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionDate21SD1.mmPlaceAndName, CorporateActionDate21SD1.mmWebServiceNotificationDate, CorporateActionDate21SD1.mmPreviousWebServiceNotificationDate,
						CorporateActionDate21SD1.mmActualRecordDate, CorporateActionDate21SD1.mmBoardMeetingDate, CorporateActionDate21SD1.mmCorporateRegistrationDate, CorporateActionDate21SD1.mmEarliestPlannedDateOfIssuePrice,
						CorporateActionDate21SD1.mmLatestPlannedDateOfIssuePrice, CorporateActionDate21SD1.mmDateOfIssuePrice, CorporateActionDate21SD1.mmEarliestPlannedSubscriptionCostPaymentDate,
						CorporateActionDate21SD1.mmLatestPlannedSubscriptionCostPaymentDate, CorporateActionDate21SD1.mmSubsequentListingDate, CorporateActionDate21SD1.mmNewShareUnitQuantityEffectiveDate);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionDate21SD1";
				definition = "Extension to cater for specific corporate action dates.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PlcAndNm")
	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public void setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
	}

	@XmlElement(name = "WebSvcNtfctnDt")
	public DateFormat22Choice getWebServiceNotificationDate() {
		return webServiceNotificationDate;
	}

	public void setWebServiceNotificationDate(DateFormat22Choice webServiceNotificationDate) {
		this.webServiceNotificationDate = webServiceNotificationDate;
	}

	@XmlElement(name = "PrvsWebSvcNtfctnDt")
	public DateFormat22Choice getPreviousWebServiceNotificationDate() {
		return previousWebServiceNotificationDate;
	}

	public void setPreviousWebServiceNotificationDate(DateFormat22Choice previousWebServiceNotificationDate) {
		this.previousWebServiceNotificationDate = previousWebServiceNotificationDate;
	}

	@XmlElement(name = "ActlRcrdDt")
	public DateFormat22Choice getActualRecordDate() {
		return actualRecordDate;
	}

	public void setActualRecordDate(DateFormat22Choice actualRecordDate) {
		this.actualRecordDate = actualRecordDate;
	}

	@XmlElement(name = "BrdMtgDt")
	public DateFormat22Choice getBoardMeetingDate() {
		return boardMeetingDate;
	}

	public void setBoardMeetingDate(DateFormat22Choice boardMeetingDate) {
		this.boardMeetingDate = boardMeetingDate;
	}

	@XmlElement(name = "CorpRegnDt")
	public DateFormat22Choice getCorporateRegistrationDate() {
		return corporateRegistrationDate;
	}

	public void setCorporateRegistrationDate(DateFormat22Choice corporateRegistrationDate) {
		this.corporateRegistrationDate = corporateRegistrationDate;
	}

	@XmlElement(name = "EarlstPlandDtOfIssePric")
	public DateFormat22Choice getEarliestPlannedDateOfIssuePrice() {
		return earliestPlannedDateOfIssuePrice;
	}

	public void setEarliestPlannedDateOfIssuePrice(DateFormat22Choice earliestPlannedDateOfIssuePrice) {
		this.earliestPlannedDateOfIssuePrice = earliestPlannedDateOfIssuePrice;
	}

	@XmlElement(name = "LatstPlandDtOfIssePric")
	public DateFormat22Choice getLatestPlannedDateOfIssuePrice() {
		return latestPlannedDateOfIssuePrice;
	}

	public void setLatestPlannedDateOfIssuePrice(DateFormat22Choice latestPlannedDateOfIssuePrice) {
		this.latestPlannedDateOfIssuePrice = latestPlannedDateOfIssuePrice;
	}

	@XmlElement(name = "DtOfIssePric")
	public DateFormat22Choice getDateOfIssuePrice() {
		return dateOfIssuePrice;
	}

	public void setDateOfIssuePrice(DateFormat22Choice dateOfIssuePrice) {
		this.dateOfIssuePrice = dateOfIssuePrice;
	}

	@XmlElement(name = "EarlstPlandSbcptCostPmtDt")
	public DateFormat22Choice getEarliestPlannedSubscriptionCostPaymentDate() {
		return earliestPlannedSubscriptionCostPaymentDate;
	}

	public void setEarliestPlannedSubscriptionCostPaymentDate(DateFormat22Choice earliestPlannedSubscriptionCostPaymentDate) {
		this.earliestPlannedSubscriptionCostPaymentDate = earliestPlannedSubscriptionCostPaymentDate;
	}

	@XmlElement(name = "LatstPlandSbcptCostPmtDt")
	public DateFormat22Choice getLatestPlannedSubscriptionCostPaymentDate() {
		return latestPlannedSubscriptionCostPaymentDate;
	}

	public void setLatestPlannedSubscriptionCostPaymentDate(DateFormat22Choice latestPlannedSubscriptionCostPaymentDate) {
		this.latestPlannedSubscriptionCostPaymentDate = latestPlannedSubscriptionCostPaymentDate;
	}

	@XmlElement(name = "SbsqntListgDt")
	public DateFormat22Choice getSubsequentListingDate() {
		return subsequentListingDate;
	}

	public void setSubsequentListingDate(DateFormat22Choice subsequentListingDate) {
		this.subsequentListingDate = subsequentListingDate;
	}

	@XmlElement(name = "NewShrUnitQtyFctvDt")
	public DateFormat22Choice getNewShareUnitQuantityEffectiveDate() {
		return newShareUnitQuantityEffectiveDate;
	}

	public void setNewShareUnitQuantityEffectiveDate(DateFormat22Choice newShareUnitQuantityEffectiveDate) {
		this.newShareUnitQuantityEffectiveDate = newShareUnitQuantityEffectiveDate;
	}
}