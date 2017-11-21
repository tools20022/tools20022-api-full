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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.AccountStatusUpdateInstruction1Choice;
import com.tools20022.repository.choice.AccountStatusUpdateInstructionReason1Choice;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Instruction for a change to an account status and reason for the change.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountStatusUpdateInstruction1#mmUpdateInstruction
 * AccountStatusUpdateInstruction1.mmUpdateInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountStatusUpdateInstruction1#mmUpdateInstructionReason
 * AccountStatusUpdateInstruction1.mmUpdateInstructionReason}</li>
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
 * "AccountStatusUpdateInstruction1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Instruction for a change to an account status and reason for the change."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AccountStatusUpdateInstruction1", propOrder = {"updateInstruction", "updateInstructionReason"})
public class AccountStatusUpdateInstruction1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AccountStatusUpdateInstruction1Choice updateInstruction;
	/**
	 * Type of status change instructed for the account status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AccountStatusUpdateInstruction1Choice
	 * AccountStatusUpdateInstruction1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountStatusUpdateInstruction1
	 * AccountStatusUpdateInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UpdInstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UpdateInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of status change instructed for the account status."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUpdateInstruction = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountStatusUpdateInstruction1.mmObject();
			isDerived = false;
			xmlTag = "UpdInstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpdateInstruction";
			definition = "Type of status change instructed for the account status.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AccountStatusUpdateInstruction1Choice.mmObject();
		}
	};
	protected AccountStatusUpdateInstructionReason1Choice updateInstructionReason;
	/**
	 * Reason for the instruction to change the account status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AccountStatusUpdateInstructionReason1Choice
	 * AccountStatusUpdateInstructionReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountStatusUpdateInstruction1
	 * AccountStatusUpdateInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UpdInstrRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UpdateInstructionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the instruction to change the account status."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUpdateInstructionReason = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountStatusUpdateInstruction1.mmObject();
			isDerived = false;
			xmlTag = "UpdInstrRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpdateInstructionReason";
			definition = "Reason for the instruction to change the account status.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountStatusUpdateInstructionReason1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AccountStatusUpdateInstruction1.mmUpdateInstruction, AccountStatusUpdateInstruction1.mmUpdateInstructionReason);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountStatusUpdateInstruction1";
				definition = "Instruction for a change to an account status and reason for the change.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "UpdInstr", required = true)
	public AccountStatusUpdateInstruction1Choice getUpdateInstruction() {
		return updateInstruction;
	}

	public void setUpdateInstruction(AccountStatusUpdateInstruction1Choice updateInstruction) {
		this.updateInstruction = updateInstruction;
	}

	@XmlElement(name = "UpdInstrRsn")
	public AccountStatusUpdateInstructionReason1Choice getUpdateInstructionReason() {
		return updateInstructionReason;
	}

	public void setUpdateInstructionReason(AccountStatusUpdateInstructionReason1Choice updateInstructionReason) {
		this.updateInstructionReason = updateInstructionReason;
	}
}