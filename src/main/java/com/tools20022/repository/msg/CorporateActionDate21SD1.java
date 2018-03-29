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
import java.util.Optional;
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionDate21SD1", propOrder = {"placeAndName", "webServiceNotificationDate", "previousWebServiceNotificationDate", "actualRecordDate", "boardMeetingDate", "corporateRegistrationDate",
		"earliestPlannedDateOfIssuePrice", "latestPlannedDateOfIssuePrice", "dateOfIssuePrice", "earliestPlannedSubscriptionCostPaymentDate", "latestPlannedSubscriptionCostPaymentDate", "subsequentListingDate",
		"newShareUnitQuantityEffectiveDate"})
public class CorporateActionDate21SD1 {

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
	public static final MMMessageAttribute<CorporateActionDate21SD1, Optional<Max350Text>> mmPlaceAndName = new MMMessageAttribute<CorporateActionDate21SD1, Optional<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate21SD1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "Unambiguous reference to the location where the supplementary data must be inserted in the message instance. \r\n\r\nIn the case of XML, this is expressed by a valid XPath.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(CorporateActionDate21SD1 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(CorporateActionDate21SD1 obj, Optional<Max350Text> value) {
			obj.setPlaceAndName(value.orElse(null));
		}
	};
	@XmlElement(name = "WebSvcNtfctnDt")
	protected DateFormat22Choice webServiceNotificationDate;
	/**
	 * 
	 <p>
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
	 * "Date and time of notification via web service as reference information.\r\n通知日時 Notification date and time."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDate21SD1, Optional<DateFormat22Choice>> mmWebServiceNotificationDate = new MMMessageAttribute<CorporateActionDate21SD1, Optional<DateFormat22Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate21SD1.mmObject();
			isDerived = false;
			xmlTag = "WebSvcNtfctnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WebServiceNotificationDate";
			definition = "Date and time of notification via web service as reference information.\r\n通知日時 Notification date and time.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat22Choice.mmObject();
		}

		@Override
		public Optional<DateFormat22Choice> getValue(CorporateActionDate21SD1 obj) {
			return obj.getWebServiceNotificationDate();
		}

		@Override
		public void setValue(CorporateActionDate21SD1 obj, Optional<DateFormat22Choice> value) {
			obj.setWebServiceNotificationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "PrvsWebSvcNtfctnDt")
	protected DateFormat22Choice previousWebServiceNotificationDate;
	/**
	 * 
	 <p>
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
	 * "Date and time of previous notification via web service as a reference information (in case of replacement). \r\n訂正（削除）前通知日時."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDate21SD1, Optional<DateFormat22Choice>> mmPreviousWebServiceNotificationDate = new MMMessageAttribute<CorporateActionDate21SD1, Optional<DateFormat22Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate21SD1.mmObject();
			isDerived = false;
			xmlTag = "PrvsWebSvcNtfctnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousWebServiceNotificationDate";
			definition = "Date and time of previous notification via web service as a reference information (in case of replacement). \r\n訂正（削除）前通知日時.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat22Choice.mmObject();
		}

		@Override
		public Optional<DateFormat22Choice> getValue(CorporateActionDate21SD1 obj) {
			return obj.getPreviousWebServiceNotificationDate();
		}

		@Override
		public void setValue(CorporateActionDate21SD1 obj, Optional<DateFormat22Choice> value) {
			obj.setPreviousWebServiceNotificationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "ActlRcrdDt")
	protected DateFormat22Choice actualRecordDate;
	/**
	 * 
	 <p>
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
	 * "Actual record date - the previous business day of the record date if the record date falls to Saturday, Sunday or national holiday.\r\n権利確定日."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDate21SD1, Optional<DateFormat22Choice>> mmActualRecordDate = new MMMessageAttribute<CorporateActionDate21SD1, Optional<DateFormat22Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate21SD1.mmObject();
			isDerived = false;
			xmlTag = "ActlRcrdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualRecordDate";
			definition = "Actual record date - the previous business day of the record date if the record date falls to Saturday, Sunday or national holiday.\r\n権利確定日.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat22Choice.mmObject();
		}

		@Override
		public Optional<DateFormat22Choice> getValue(CorporateActionDate21SD1 obj) {
			return obj.getActualRecordDate();
		}

		@Override
		public void setValue(CorporateActionDate21SD1 obj, Optional<DateFormat22Choice> value) {
			obj.setActualRecordDate(value.orElse(null));
		}
	};
	@XmlElement(name = "BrdMtgDt")
	protected DateFormat22Choice boardMeetingDate;
	/**
	 * 
	 <p>
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
	 * definition} = "Date of the board meeting.\r\n取締役会決議日."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDate21SD1, Optional<DateFormat22Choice>> mmBoardMeetingDate = new MMMessageAttribute<CorporateActionDate21SD1, Optional<DateFormat22Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate21SD1.mmObject();
			isDerived = false;
			xmlTag = "BrdMtgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BoardMeetingDate";
			definition = "Date of the board meeting.\r\n取締役会決議日.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat22Choice.mmObject();
		}

		@Override
		public Optional<DateFormat22Choice> getValue(CorporateActionDate21SD1 obj) {
			return obj.getBoardMeetingDate();
		}

		@Override
		public void setValue(CorporateActionDate21SD1 obj, Optional<DateFormat22Choice> value) {
			obj.setBoardMeetingDate(value.orElse(null));
		}
	};
	@XmlElement(name = "CorpRegnDt")
	protected DateFormat22Choice corporateRegistrationDate;
	/**
	 * 
	 <p>
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
	 * "Date on which the new company will be registered.\r\n新設会社登記日."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDate21SD1, Optional<DateFormat22Choice>> mmCorporateRegistrationDate = new MMMessageAttribute<CorporateActionDate21SD1, Optional<DateFormat22Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate21SD1.mmObject();
			isDerived = false;
			xmlTag = "CorpRegnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateRegistrationDate";
			definition = "Date on which the new company will be registered.\r\n新設会社登記日.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat22Choice.mmObject();
		}

		@Override
		public Optional<DateFormat22Choice> getValue(CorporateActionDate21SD1 obj) {
			return obj.getCorporateRegistrationDate();
		}

		@Override
		public void setValue(CorporateActionDate21SD1 obj, Optional<DateFormat22Choice> value) {
			obj.setCorporateRegistrationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "EarlstPlandDtOfIssePric")
	protected DateFormat22Choice earliestPlannedDateOfIssuePrice;
	/**
	 * 
	 <p>
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
	 * "Earliest planned date on which the issue price will be set.\r\n発行価格決定予定日（最短）."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDate21SD1, Optional<DateFormat22Choice>> mmEarliestPlannedDateOfIssuePrice = new MMMessageAttribute<CorporateActionDate21SD1, Optional<DateFormat22Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate21SD1.mmObject();
			isDerived = false;
			xmlTag = "EarlstPlandDtOfIssePric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarliestPlannedDateOfIssuePrice";
			definition = "Earliest planned date on which the issue price will be set.\r\n発行価格決定予定日（最短）.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat22Choice.mmObject();
		}

		@Override
		public Optional<DateFormat22Choice> getValue(CorporateActionDate21SD1 obj) {
			return obj.getEarliestPlannedDateOfIssuePrice();
		}

		@Override
		public void setValue(CorporateActionDate21SD1 obj, Optional<DateFormat22Choice> value) {
			obj.setEarliestPlannedDateOfIssuePrice(value.orElse(null));
		}
	};
	@XmlElement(name = "LatstPlandDtOfIssePric")
	protected DateFormat22Choice latestPlannedDateOfIssuePrice;
	/**
	 * 
	 <p>
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
	 * "Latest planned date on which the issue price will be set.\r\n発行価格決定予定日（最長）."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDate21SD1, Optional<DateFormat22Choice>> mmLatestPlannedDateOfIssuePrice = new MMMessageAttribute<CorporateActionDate21SD1, Optional<DateFormat22Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate21SD1.mmObject();
			isDerived = false;
			xmlTag = "LatstPlandDtOfIssePric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LatestPlannedDateOfIssuePrice";
			definition = "Latest planned date on which the issue price will be set.\r\n発行価格決定予定日（最長）.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat22Choice.mmObject();
		}

		@Override
		public Optional<DateFormat22Choice> getValue(CorporateActionDate21SD1 obj) {
			return obj.getLatestPlannedDateOfIssuePrice();
		}

		@Override
		public void setValue(CorporateActionDate21SD1 obj, Optional<DateFormat22Choice> value) {
			obj.setLatestPlannedDateOfIssuePrice(value.orElse(null));
		}
	};
	@XmlElement(name = "DtOfIssePric")
	protected DateFormat22Choice dateOfIssuePrice;
	/**
	 * 
	 <p>
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
	 * definition} = "Date on which the issue price will be set.\r\n発行価格決定日."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDate21SD1, Optional<DateFormat22Choice>> mmDateOfIssuePrice = new MMMessageAttribute<CorporateActionDate21SD1, Optional<DateFormat22Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate21SD1.mmObject();
			isDerived = false;
			xmlTag = "DtOfIssePric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateOfIssuePrice";
			definition = "Date on which the issue price will be set.\r\n発行価格決定日.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat22Choice.mmObject();
		}

		@Override
		public Optional<DateFormat22Choice> getValue(CorporateActionDate21SD1 obj) {
			return obj.getDateOfIssuePrice();
		}

		@Override
		public void setValue(CorporateActionDate21SD1 obj, Optional<DateFormat22Choice> value) {
			obj.setDateOfIssuePrice(value.orElse(null));
		}
	};
	@XmlElement(name = "EarlstPlandSbcptCostPmtDt")
	protected DateFormat22Choice earliestPlannedSubscriptionCostPaymentDate;
	/**
	 * 
	 <p>
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
	 * "Earliest planned date on which the cash payment (for the subscription cost) will be made.\r\n払込期日予定日（最短）."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDate21SD1, Optional<DateFormat22Choice>> mmEarliestPlannedSubscriptionCostPaymentDate = new MMMessageAttribute<CorporateActionDate21SD1, Optional<DateFormat22Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate21SD1.mmObject();
			isDerived = false;
			xmlTag = "EarlstPlandSbcptCostPmtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarliestPlannedSubscriptionCostPaymentDate";
			definition = "Earliest planned date on which the cash payment (for the subscription cost) will be made.\r\n払込期日予定日（最短）.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat22Choice.mmObject();
		}

		@Override
		public Optional<DateFormat22Choice> getValue(CorporateActionDate21SD1 obj) {
			return obj.getEarliestPlannedSubscriptionCostPaymentDate();
		}

		@Override
		public void setValue(CorporateActionDate21SD1 obj, Optional<DateFormat22Choice> value) {
			obj.setEarliestPlannedSubscriptionCostPaymentDate(value.orElse(null));
		}
	};
	@XmlElement(name = "LatstPlandSbcptCostPmtDt")
	protected DateFormat22Choice latestPlannedSubscriptionCostPaymentDate;
	/**
	 * 
	 <p>
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
	 * "Latest planned date on which the cash payment (for the subscription cost) will be made.\r\n払込期日予定日（最長）."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDate21SD1, Optional<DateFormat22Choice>> mmLatestPlannedSubscriptionCostPaymentDate = new MMMessageAttribute<CorporateActionDate21SD1, Optional<DateFormat22Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate21SD1.mmObject();
			isDerived = false;
			xmlTag = "LatstPlandSbcptCostPmtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LatestPlannedSubscriptionCostPaymentDate";
			definition = "Latest planned date on which the cash payment (for the subscription cost) will be made.\r\n払込期日予定日（最長）.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat22Choice.mmObject();
		}

		@Override
		public Optional<DateFormat22Choice> getValue(CorporateActionDate21SD1 obj) {
			return obj.getLatestPlannedSubscriptionCostPaymentDate();
		}

		@Override
		public void setValue(CorporateActionDate21SD1 obj, Optional<DateFormat22Choice> value) {
			obj.setLatestPlannedSubscriptionCostPaymentDate(value.orElse(null));
		}
	};
	@XmlElement(name = "SbsqntListgDt")
	protected DateFormat22Choice subsequentListingDate;
	/**
	 * 
	 <p>
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
	 * "Listing date of the new shares announced by Stock Exchange.\r\n変更上場日."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDate21SD1, Optional<DateFormat22Choice>> mmSubsequentListingDate = new MMMessageAttribute<CorporateActionDate21SD1, Optional<DateFormat22Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate21SD1.mmObject();
			isDerived = false;
			xmlTag = "SbsqntListgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubsequentListingDate";
			definition = "Listing date of the new shares announced by Stock Exchange.\r\n変更上場日.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat22Choice.mmObject();
		}

		@Override
		public Optional<DateFormat22Choice> getValue(CorporateActionDate21SD1 obj) {
			return obj.getSubsequentListingDate();
		}

		@Override
		public void setValue(CorporateActionDate21SD1 obj, Optional<DateFormat22Choice> value) {
			obj.setSubsequentListingDate(value.orElse(null));
		}
	};
	@XmlElement(name = "NewShrUnitQtyFctvDt")
	protected DateFormat22Choice newShareUnitQuantityEffectiveDate;
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
	public static final MMMessageAssociationEnd<CorporateActionDate21SD1, Optional<DateFormat22Choice>> mmNewShareUnitQuantityEffectiveDate = new MMMessageAssociationEnd<CorporateActionDate21SD1, Optional<DateFormat22Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate21SD1.mmObject();
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

		@Override
		public Optional<DateFormat22Choice> getValue(CorporateActionDate21SD1 obj) {
			return obj.getNewShareUnitQuantityEffectiveDate();
		}

		@Override
		public void setValue(CorporateActionDate21SD1 obj, Optional<DateFormat22Choice> value) {
			obj.setNewShareUnitQuantityEffectiveDate(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate21SD1.mmPlaceAndName, com.tools20022.repository.msg.CorporateActionDate21SD1.mmWebServiceNotificationDate,
						com.tools20022.repository.msg.CorporateActionDate21SD1.mmPreviousWebServiceNotificationDate, com.tools20022.repository.msg.CorporateActionDate21SD1.mmActualRecordDate,
						com.tools20022.repository.msg.CorporateActionDate21SD1.mmBoardMeetingDate, com.tools20022.repository.msg.CorporateActionDate21SD1.mmCorporateRegistrationDate,
						com.tools20022.repository.msg.CorporateActionDate21SD1.mmEarliestPlannedDateOfIssuePrice, com.tools20022.repository.msg.CorporateActionDate21SD1.mmLatestPlannedDateOfIssuePrice,
						com.tools20022.repository.msg.CorporateActionDate21SD1.mmDateOfIssuePrice, com.tools20022.repository.msg.CorporateActionDate21SD1.mmEarliestPlannedSubscriptionCostPaymentDate,
						com.tools20022.repository.msg.CorporateActionDate21SD1.mmLatestPlannedSubscriptionCostPaymentDate, com.tools20022.repository.msg.CorporateActionDate21SD1.mmSubsequentListingDate,
						com.tools20022.repository.msg.CorporateActionDate21SD1.mmNewShareUnitQuantityEffectiveDate);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionDate21SD1";
				definition = "Extension to cater for specific corporate action dates.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max350Text> getPlaceAndName() {
		return placeAndName == null ? Optional.empty() : Optional.of(placeAndName);
	}

	public CorporateActionDate21SD1 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
		return this;
	}

	public Optional<DateFormat22Choice> getWebServiceNotificationDate() {
		return webServiceNotificationDate == null ? Optional.empty() : Optional.of(webServiceNotificationDate);
	}

	public CorporateActionDate21SD1 setWebServiceNotificationDate(DateFormat22Choice webServiceNotificationDate) {
		this.webServiceNotificationDate = webServiceNotificationDate;
		return this;
	}

	public Optional<DateFormat22Choice> getPreviousWebServiceNotificationDate() {
		return previousWebServiceNotificationDate == null ? Optional.empty() : Optional.of(previousWebServiceNotificationDate);
	}

	public CorporateActionDate21SD1 setPreviousWebServiceNotificationDate(DateFormat22Choice previousWebServiceNotificationDate) {
		this.previousWebServiceNotificationDate = previousWebServiceNotificationDate;
		return this;
	}

	public Optional<DateFormat22Choice> getActualRecordDate() {
		return actualRecordDate == null ? Optional.empty() : Optional.of(actualRecordDate);
	}

	public CorporateActionDate21SD1 setActualRecordDate(DateFormat22Choice actualRecordDate) {
		this.actualRecordDate = actualRecordDate;
		return this;
	}

	public Optional<DateFormat22Choice> getBoardMeetingDate() {
		return boardMeetingDate == null ? Optional.empty() : Optional.of(boardMeetingDate);
	}

	public CorporateActionDate21SD1 setBoardMeetingDate(DateFormat22Choice boardMeetingDate) {
		this.boardMeetingDate = boardMeetingDate;
		return this;
	}

	public Optional<DateFormat22Choice> getCorporateRegistrationDate() {
		return corporateRegistrationDate == null ? Optional.empty() : Optional.of(corporateRegistrationDate);
	}

	public CorporateActionDate21SD1 setCorporateRegistrationDate(DateFormat22Choice corporateRegistrationDate) {
		this.corporateRegistrationDate = corporateRegistrationDate;
		return this;
	}

	public Optional<DateFormat22Choice> getEarliestPlannedDateOfIssuePrice() {
		return earliestPlannedDateOfIssuePrice == null ? Optional.empty() : Optional.of(earliestPlannedDateOfIssuePrice);
	}

	public CorporateActionDate21SD1 setEarliestPlannedDateOfIssuePrice(DateFormat22Choice earliestPlannedDateOfIssuePrice) {
		this.earliestPlannedDateOfIssuePrice = earliestPlannedDateOfIssuePrice;
		return this;
	}

	public Optional<DateFormat22Choice> getLatestPlannedDateOfIssuePrice() {
		return latestPlannedDateOfIssuePrice == null ? Optional.empty() : Optional.of(latestPlannedDateOfIssuePrice);
	}

	public CorporateActionDate21SD1 setLatestPlannedDateOfIssuePrice(DateFormat22Choice latestPlannedDateOfIssuePrice) {
		this.latestPlannedDateOfIssuePrice = latestPlannedDateOfIssuePrice;
		return this;
	}

	public Optional<DateFormat22Choice> getDateOfIssuePrice() {
		return dateOfIssuePrice == null ? Optional.empty() : Optional.of(dateOfIssuePrice);
	}

	public CorporateActionDate21SD1 setDateOfIssuePrice(DateFormat22Choice dateOfIssuePrice) {
		this.dateOfIssuePrice = dateOfIssuePrice;
		return this;
	}

	public Optional<DateFormat22Choice> getEarliestPlannedSubscriptionCostPaymentDate() {
		return earliestPlannedSubscriptionCostPaymentDate == null ? Optional.empty() : Optional.of(earliestPlannedSubscriptionCostPaymentDate);
	}

	public CorporateActionDate21SD1 setEarliestPlannedSubscriptionCostPaymentDate(DateFormat22Choice earliestPlannedSubscriptionCostPaymentDate) {
		this.earliestPlannedSubscriptionCostPaymentDate = earliestPlannedSubscriptionCostPaymentDate;
		return this;
	}

	public Optional<DateFormat22Choice> getLatestPlannedSubscriptionCostPaymentDate() {
		return latestPlannedSubscriptionCostPaymentDate == null ? Optional.empty() : Optional.of(latestPlannedSubscriptionCostPaymentDate);
	}

	public CorporateActionDate21SD1 setLatestPlannedSubscriptionCostPaymentDate(DateFormat22Choice latestPlannedSubscriptionCostPaymentDate) {
		this.latestPlannedSubscriptionCostPaymentDate = latestPlannedSubscriptionCostPaymentDate;
		return this;
	}

	public Optional<DateFormat22Choice> getSubsequentListingDate() {
		return subsequentListingDate == null ? Optional.empty() : Optional.of(subsequentListingDate);
	}

	public CorporateActionDate21SD1 setSubsequentListingDate(DateFormat22Choice subsequentListingDate) {
		this.subsequentListingDate = subsequentListingDate;
		return this;
	}

	public Optional<DateFormat22Choice> getNewShareUnitQuantityEffectiveDate() {
		return newShareUnitQuantityEffectiveDate == null ? Optional.empty() : Optional.of(newShareUnitQuantityEffectiveDate);
	}

	public CorporateActionDate21SD1 setNewShareUnitQuantityEffectiveDate(DateFormat22Choice newShareUnitQuantityEffectiveDate) {
		this.newShareUnitQuantityEffectiveDate = newShareUnitQuantityEffectiveDate;
		return this;
	}
}