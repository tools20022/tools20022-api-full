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

package com.tools20022.repository.area.camt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.CashManagementArchive;
import com.tools20022.repository.msg.GroupHeader43;
import com.tools20022.repository.msg.OriginalNotification4;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The NotificationToReceiveCancellationAdvice message is sent by an account
 * owner or by a party acting on the account owner's behalf to one of the
 * account owner's account servicing institutions. It is used to advise the
 * account servicing institution about the cancellation of one or more
 * notifications in a previous NotificationToReceive message.<br>
 * <b>Usage</b><br>
 * The NotificationToReceiveCancellationAdvice message is used to advise the
 * account servicing institution that the funds are no longer expected. The
 * message can be used in either a direct or a relay scenario.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.058.001.02}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementArchive
 * CashManagementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationToReceiveCancellationAdviceV02#mmGroupHeader
 * NotificationToReceiveCancellationAdviceV02.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationToReceiveCancellationAdviceV02#mmOriginalNotification
 * NotificationToReceiveCancellationAdviceV02.mmOriginalNotification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "NtfctnToRcvCxlAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NotificationToReceiveCancellationAdviceV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe NotificationToReceiveCancellationAdvice message is sent by an account owner or by a party acting on the account owner's behalf to one of the account owner's account servicing institutions. It is used to advise the account servicing institution about the cancellation of one or more notifications in a previous NotificationToReceive message.\r\nUsage\r\nThe NotificationToReceiveCancellationAdvice message is used to advise the account servicing institution that the funds are no longer expected. The message can be used in either a direct or a relay scenario."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationToReceiveCancellationAdviceV03
 * NotificationToReceiveCancellationAdviceV03}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "NotificationToReceiveCancellationAdviceV02", propOrder = {"groupHeader", "originalNotification"})
public class NotificationToReceiveCancellationAdviceV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GrpHdr", required = true)
	protected GroupHeader43 groupHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader43
	 * GroupHeader43}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrpHdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide further details on the message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<NotificationToReceiveCancellationAdviceV02, GroupHeader43> mmGroupHeader = new MMMessageBuildingBlock<NotificationToReceiveCancellationAdviceV02, GroupHeader43>() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of elements used to provide further details on the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader43.mmObject();
		}

		@Override
		public GroupHeader43 getValue(NotificationToReceiveCancellationAdviceV02 obj) {
			return obj.getGroupHeader();
		}

		@Override
		public void setValue(NotificationToReceiveCancellationAdviceV02 obj, GroupHeader43 value) {
			obj.setGroupHeader(value);
		}
	};
	@XmlElement(name = "OrgnlNtfctn", required = true)
	protected OriginalNotification4 originalNotification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification4
	 * OriginalNotification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlNtfctn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalNotification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to identify the original notification, to which the cancellation advice refers."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<NotificationToReceiveCancellationAdviceV02, OriginalNotification4> mmOriginalNotification = new MMMessageBuildingBlock<NotificationToReceiveCancellationAdviceV02, OriginalNotification4>() {
		{
			xmlTag = "OrgnlNtfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalNotification";
			definition = "Set of elements used to identify the original notification, to which the cancellation advice refers.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> OriginalNotification4.mmObject();
		}

		@Override
		public OriginalNotification4 getValue(NotificationToReceiveCancellationAdviceV02 obj) {
			return obj.getOriginalNotification();
		}

		@Override
		public void setValue(NotificationToReceiveCancellationAdviceV02 obj, OriginalNotification4 value) {
			obj.setOriginalNotification(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NotificationToReceiveCancellationAdviceV02";
				definition = "Scope\r\nThe NotificationToReceiveCancellationAdvice message is sent by an account owner or by a party acting on the account owner's behalf to one of the account owner's account servicing institutions. It is used to advise the account servicing institution about the cancellation of one or more notifications in a previous NotificationToReceive message.\r\nUsage\r\nThe NotificationToReceiveCancellationAdvice message is used to advise the account servicing institution that the funds are no longer expected. The message can be used in either a direct or a relay scenario.";
				nextVersions_lazy = () -> Arrays.asList(NotificationToReceiveCancellationAdviceV03.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "NtfctnToRcvCxlAdvc";
				businessArea_lazy = () -> CashManagementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.NotificationToReceiveCancellationAdviceV02.mmGroupHeader,
						com.tools20022.repository.area.camt.NotificationToReceiveCancellationAdviceV02.mmOriginalNotification);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "058";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return NotificationToReceiveCancellationAdviceV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GroupHeader43 getGroupHeader() {
		return groupHeader;
	}

	public NotificationToReceiveCancellationAdviceV02 setGroupHeader(GroupHeader43 groupHeader) {
		this.groupHeader = Objects.requireNonNull(groupHeader);
		return this;
	}

	public OriginalNotification4 getOriginalNotification() {
		return originalNotification;
	}

	public NotificationToReceiveCancellationAdviceV02 setOriginalNotification(OriginalNotification4 originalNotification) {
		this.originalNotification = Objects.requireNonNull(originalNotification);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.058.001.02")
	static public class Document {
		@XmlElement(name = "NtfctnToRcvCxlAdvc", required = true)
		public NotificationToReceiveCancellationAdviceV02 messageBody;
	}
}