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
import com.tools20022.repository.choice.InstructionStatus6Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.AccountIdentification;
import com.tools20022.repository.entity.MeetingStatus;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Status applying to individual instructions of a MeetingInstruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus11#mmInstructionIdentification
 * DetailedInstructionStatus11.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus11#mmAccountIdentification
 * DetailedInstructionStatus11.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus11#mmSubAccountIdentification
 * DetailedInstructionStatus11.mmSubAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus11#mmInstructionStatus
 * DetailedInstructionStatus11.mmInstructionStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.MeetingStatus
 * MeetingStatus}</li>
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
 * "DetailedInstructionStatus11"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Status applying to individual instructions of a MeetingInstruction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus8
 * DetailedInstructionStatus8}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "DetailedInstructionStatus11", propOrder = {"instructionIdentification", "accountIdentification", "subAccountIdentification", "instructionStatus"})
public class DetailedInstructionStatus11 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text instructionIdentification;
	/**
	 * Identifies the detailed instruction within an instruction message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus11
	 * DetailedInstructionStatus11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the detailed instruction within an instruction message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus8#mmInstructionIdentification
	 * DetailedInstructionStatus8.mmInstructionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructionIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DetailedInstructionStatus11.mmObject();
			isDerived = false;
			xmlTag = "InstrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionIdentification";
			definition = "Identifies the detailed instruction within an instruction message.";
			previousVersion_lazy = () -> DetailedInstructionStatus8.mmInstructionIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text accountIdentification;
	/**
	 * Identifies the safekeeping account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmNumber
	 * AccountIdentification.mmNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus11
	 * DetailedInstructionStatus11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the safekeeping account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus8#mmAccountIdentification
	 * DetailedInstructionStatus8.mmAccountIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountIdentification.mmNumber;
			componentContext_lazy = () -> DetailedInstructionStatus11.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Identifies the safekeeping account.";
			previousVersion_lazy = () -> DetailedInstructionStatus8.mmAccountIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text subAccountIdentification;
	/**
	 * Identifies the subaccount of the safekeeping account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmNumber
	 * AccountIdentification.mmNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus11
	 * DetailedInstructionStatus11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubAcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubAccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the subaccount of the safekeeping account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus8#mmSubAccountIdentification
	 * DetailedInstructionStatus8.mmSubAccountIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubAccountIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountIdentification.mmNumber;
			componentContext_lazy = () -> DetailedInstructionStatus11.mmObject();
			isDerived = false;
			xmlTag = "SubAcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccountIdentification";
			definition = "Identifies the subaccount of the safekeeping account.";
			previousVersion_lazy = () -> DetailedInstructionStatus8.mmSubAccountIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected InstructionStatus6Choice instructionStatus;
	/**
	 * Status applying to individual instructions of a MeetingInstruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus6Choice
	 * InstructionStatus6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmInstructionProcessingStatus
	 * Status.mmInstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus11
	 * DetailedInstructionStatus11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status applying to individual instructions of a MeetingInstruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus8#mmInstructionStatus
	 * DetailedInstructionStatus8.mmInstructionStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstructionStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Status.mmInstructionProcessingStatus;
			componentContext_lazy = () -> DetailedInstructionStatus11.mmObject();
			isDerived = false;
			xmlTag = "InstrSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionStatus";
			definition = "Status applying to individual instructions of a MeetingInstruction.";
			previousVersion_lazy = () -> DetailedInstructionStatus8.mmInstructionStatus;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InstructionStatus6Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(DetailedInstructionStatus11.mmInstructionIdentification, DetailedInstructionStatus11.mmAccountIdentification, DetailedInstructionStatus11.mmSubAccountIdentification,
						DetailedInstructionStatus11.mmInstructionStatus);
				trace_lazy = () -> MeetingStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DetailedInstructionStatus11";
				definition = "Status applying to individual instructions of a MeetingInstruction.";
				previousVersion_lazy = () -> DetailedInstructionStatus8.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "InstrId", required = true)
	public Max35Text getInstructionIdentification() {
		return instructionIdentification;
	}

	public void setInstructionIdentification(Max35Text instructionIdentification) {
		this.instructionIdentification = instructionIdentification;
	}

	@XmlElement(name = "AcctId")
	public Max35Text getAccountIdentification() {
		return accountIdentification;
	}

	public void setAccountIdentification(Max35Text accountIdentification) {
		this.accountIdentification = accountIdentification;
	}

	@XmlElement(name = "SubAcctId")
	public Max35Text getSubAccountIdentification() {
		return subAccountIdentification;
	}

	public void setSubAccountIdentification(Max35Text subAccountIdentification) {
		this.subAccountIdentification = subAccountIdentification;
	}

	@XmlElement(name = "InstrSts", required = true)
	public InstructionStatus6Choice getInstructionStatus() {
		return instructionStatus;
	}

	public void setInstructionStatus(InstructionStatus6Choice instructionStatus) {
		this.instructionStatus = instructionStatus;
	}
}