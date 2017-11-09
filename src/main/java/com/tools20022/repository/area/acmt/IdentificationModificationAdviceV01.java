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

package com.tools20022.repository.area.acmt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.AccountManagementPreviousVersion;
import com.tools20022.repository.msg.IdentificationAssignment1;
import com.tools20022.repository.msg.IdentificationModification1;
import com.tools20022.repository.msg.OriginalTransactionReference14;
import com.tools20022.repository.msgset.ChangeorVerifyAccountIdentificationISOPreviousversion;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * <b>Scope</b><br>
 * The IdentificationModificationAdvice message is sent by an assigner to an
 * assignee. The message is used to advice on the correct party and/or account
 * identification information.<br>
 * <b>Usage</b><br>
 * The IdentificationModificationAdvice message is sent after the receipt of one
 * or several transaction messages that included no longer valid party and/or
 * account identification information.<br>
 * The IdentificationModificationAdvice message is exchanged between financial
 * institutions and between financial institutions and non financial
 * institutions and can contain one or more modification advises.<br>
 * There is no time limit on the time between the sending of an
 * IdentificationModificationAdvice message and the receipt of the transaction
 * messages that the IdentificationModificationAdvice refers to.<br>
 * The IdentificationModificationAdvice includes the correct party and/or
 * account identification information, the IdentificationModificationAdvice or
 * the included information may be forwarded to the initiating party of the
 * transaction messages.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code acmt.022.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AccountManagementPreviousVersion
 * AccountManagementPreviousVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.ChangeorVerifyAccountIdentificationISOPreviousversion
 * ChangeorVerifyAccountIdentificationISOPreviousversion}</li>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "IdModAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationModificationAdviceV01#mmAssignment
 * IdentificationModificationAdviceV01.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationModificationAdviceV01#mmOriginalTransactionReference
 * IdentificationModificationAdviceV01.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationModificationAdviceV01#mmModification
 * IdentificationModificationAdviceV01.mmModification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IdentificationModificationAdviceV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe IdentificationModificationAdvice message is sent by an assigner to an assignee. The message is used to advice on the correct party and/or account identification information.\r\nUsage\r\nThe IdentificationModificationAdvice message is sent after the receipt of one or several transaction messages that included no longer valid party and/or account identification information.\r\nThe IdentificationModificationAdvice message is exchanged between financial institutions and between financial institutions and non financial institutions and can contain one or more modification advises.\r\nThere is no time limit on the time between the sending of an IdentificationModificationAdvice message and the receipt of the transaction messages that the IdentificationModificationAdvice refers to.\r\nThe IdentificationModificationAdvice includes the correct party and/or account identification information, the IdentificationModificationAdvice or the included information may be forwarded to the initiating party of the transaction messages."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationModificationAdviceV02
 * IdentificationModificationAdviceV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class IdentificationModificationAdviceV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected IdentificationAssignment1 assignment;
	/**
	 * Identifies the identification assignment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.IdentificationAssignment1
	 * IdentificationAssignment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Assgnmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assignment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the identification assignment."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAssignment = new MMMessageBuildingBlock() {
		{
			xmlTag = "Assgnmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignment";
			definition = "Identifies the identification assignment.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> IdentificationAssignment1.mmObject();
		}
	};
	protected OriginalTransactionReference14 originalTransactionReference;
	/**
	 * Provides reference information on the original message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference14
	 * OriginalTransactionReference14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlTxRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalTransactionReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides reference information on the original message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOriginalTransactionReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "OrgnlTxRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalTransactionReference";
			definition = "Provides reference information on the original message.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OriginalTransactionReference14.mmObject();
		}
	};
	protected List<IdentificationModification1> modification;
	/**
	 * Information concerning the identification data that is advised to be
	 * modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.IdentificationModification1
	 * IdentificationModification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Modification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information concerning the identification data that is advised to be modified."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModification = new MMMessageBuildingBlock() {
		{
			xmlTag = "Mod";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Modification";
			definition = "Information concerning the identification data that is advised to be modified.";
			minOccurs = 1;
			complexType_lazy = () -> IdentificationModification1.mmObject();
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IdentificationModificationAdviceV01";
				definition = "Scope\r\nThe IdentificationModificationAdvice message is sent by an assigner to an assignee. The message is used to advice on the correct party and/or account identification information.\r\nUsage\r\nThe IdentificationModificationAdvice message is sent after the receipt of one or several transaction messages that included no longer valid party and/or account identification information.\r\nThe IdentificationModificationAdvice message is exchanged between financial institutions and between financial institutions and non financial institutions and can contain one or more modification advises.\r\nThere is no time limit on the time between the sending of an IdentificationModificationAdvice message and the receipt of the transaction messages that the IdentificationModificationAdvice refers to.\r\nThe IdentificationModificationAdvice includes the correct party and/or account identification information, the IdentificationModificationAdvice or the included information may be forwarded to the initiating party of the transaction messages.";
				nextVersions_lazy = () -> Arrays.asList(IdentificationModificationAdviceV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(ChangeorVerifyAccountIdentificationISOPreviousversion.mmObject(), ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "IdModAdvc";
				businessArea_lazy = () -> AccountManagementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(IdentificationModificationAdviceV01.mmAssignment, IdentificationModificationAdviceV01.mmOriginalTransactionReference, IdentificationModificationAdviceV01.mmModification);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "acmt";
						messageFunctionality = "022";
						version = "01";
						flavour = "001";
					}
				};
			}
		});
		return mmObject_lazy.get();
	}

	public IdentificationAssignment1 getAssignment() {
		return assignment;
	}

	public void setAssignment(IdentificationAssignment1 assignment) {
		this.assignment = assignment;
	}

	public OriginalTransactionReference14 getOriginalTransactionReference() {
		return originalTransactionReference;
	}

	public void setOriginalTransactionReference(OriginalTransactionReference14 originalTransactionReference) {
		this.originalTransactionReference = originalTransactionReference;
	}

	public List<IdentificationModification1> getModification() {
		return modification;
	}

	public void setModification(List<IdentificationModification1> modification) {
		this.modification = modification;
	}
}