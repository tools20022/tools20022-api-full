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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.SecuritiesTradeStatusReason;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ProprietaryStatusAndReason2;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of format for the processing status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus6Choice#mmAcknowledgedAccepted
 * ModificationProcessingStatus6Choice.mmAcknowledgedAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus6Choice#mmPendingProcessing
 * ModificationProcessingStatus6Choice.mmPendingProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus6Choice#mmDenied
 * ModificationProcessingStatus6Choice.mmDenied}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus6Choice#mmRejected
 * ModificationProcessingStatus6Choice.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus6Choice#mmRepaired
 * ModificationProcessingStatus6Choice.mmRepaired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus6Choice#mmModified
 * ModificationProcessingStatus6Choice.mmModified}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus6Choice#mmProprietary
 * ModificationProcessingStatus6Choice.mmProprietary}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ModificationProcessingStatus6Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of format for the processing status."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ModificationProcessingStatus6Choice", propOrder = {"acknowledgedAccepted", "pendingProcessing", "denied", "rejected", "repaired", "modified", "proprietary"})
public class ModificationProcessingStatus6Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected AcknowledgedAcceptedStatus15Choice acknowledgedAccepted;
	/**
	 * Instruction has been acknowledged by the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus15Choice
	 * AcknowledgedAcceptedStatus15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmAcknowledgedAcceptedReason
	 * StatusReason.mmAcknowledgedAcceptedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus6Choice
	 * ModificationProcessingStatus6Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AckdAccptd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcknowledgedAccepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction has been acknowledged by the account servicer."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAcknowledgedAccepted = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmAcknowledgedAcceptedReason;
			componentContext_lazy = () -> ModificationProcessingStatus6Choice.mmObject();
			isDerived = false;
			xmlTag = "AckdAccptd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgedAccepted";
			definition = "Instruction has been acknowledged by the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.AcknowledgedAcceptedStatus15Choice.mmObject();
		}
	};
	protected PendingProcessingStatus8Choice pendingProcessing;
	/**
	 * The modification is pending processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus8Choice
	 * PendingProcessingStatus8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmPendingReason
	 * StatusReason.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus6Choice
	 * ModificationProcessingStatus6Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgPrcg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingProcessing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The modification is pending processing."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPendingProcessing = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmPendingReason;
			componentContext_lazy = () -> ModificationProcessingStatus6Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgPrcg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingProcessing";
			definition = "The modification is pending processing.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.PendingProcessingStatus8Choice.mmObject();
		}
	};
	protected DeniedStatus13Choice denied;
	/**
	 * Modification request will not be executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus13Choice
	 * DeniedStatus13Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmDeniedReason
	 * SecuritiesTradeStatusReason.mmDeniedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus6Choice
	 * ModificationProcessingStatus6Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dnd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Denied"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Modification request will not be executed."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDenied = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatusReason.mmDeniedReason;
			componentContext_lazy = () -> ModificationProcessingStatus6Choice.mmObject();
			isDerived = false;
			xmlTag = "Dnd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Denied";
			definition = "Modification request will not be executed.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.DeniedStatus13Choice.mmObject();
		}
	};
	protected RejectionStatus10Choice rejected;
	/**
	 * Modification request has been rejected for further processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus10Choice
	 * RejectionStatus10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRejectionReason
	 * StatusReason.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus6Choice
	 * ModificationProcessingStatus6Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rjctd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Modification request has been rejected for further processing."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRejected = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmRejectionReason;
			componentContext_lazy = () -> ModificationProcessingStatus6Choice.mmObject();
			isDerived = false;
			xmlTag = "Rjctd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Modification request has been rejected for further processing.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.RejectionStatus10Choice.mmObject();
		}
	};
	protected RepairStatus9Choice repaired;
	/**
	 * Modification request is accepted but in repair.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RepairStatus9Choice
	 * RepairStatus9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmRepairReason
	 * SecuritiesTradeStatusReason.mmRepairReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus6Choice
	 * ModificationProcessingStatus6Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rprd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Repaired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Modification request is accepted but in repair."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRepaired = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatusReason.mmRepairReason;
			componentContext_lazy = () -> ModificationProcessingStatus6Choice.mmObject();
			isDerived = false;
			xmlTag = "Rprd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Repaired";
			definition = "Modification request is accepted but in repair.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.RepairStatus9Choice.mmObject();
		}
	};
	protected ModificationStatus3Choice modified;
	/**
	 * Instruction has been modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ModificationStatus3Choice
	 * ModificationStatus3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmModifiedStatusReason
	 * SecuritiesTradeStatusReason.mmModifiedStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus6Choice
	 * ModificationProcessingStatus6Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Modfd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Modified"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction has been modified."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmModified = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatusReason.mmModifiedStatusReason;
			componentContext_lazy = () -> ModificationProcessingStatus6Choice.mmObject();
			isDerived = false;
			xmlTag = "Modfd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Modified";
			definition = "Instruction has been modified.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.choice.ModificationStatus3Choice.mmObject();
		}
	};
	protected ProprietaryStatusAndReason2 proprietary;
	/**
	 * Proprietary status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason2
	 * ProprietaryStatusAndReason2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus6Choice
	 * ModificationProcessingStatus6Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Proprietary status."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProprietary = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Status.mmObject();
			componentContext_lazy = () -> ModificationProcessingStatus6Choice.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Proprietary status.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryStatusAndReason2.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ModificationProcessingStatus6Choice.mmAcknowledgedAccepted, ModificationProcessingStatus6Choice.mmPendingProcessing, ModificationProcessingStatus6Choice.mmDenied,
						ModificationProcessingStatus6Choice.mmRejected, ModificationProcessingStatus6Choice.mmRepaired, ModificationProcessingStatus6Choice.mmModified, ModificationProcessingStatus6Choice.mmProprietary);
				trace_lazy = () -> Status.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "ModificationProcessingStatus6Choice";
				definition = "Choice of format for the processing status.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AckdAccptd", required = true)
	public AcknowledgedAcceptedStatus15Choice getAcknowledgedAccepted() {
		return acknowledgedAccepted;
	}

	public void setAcknowledgedAccepted(com.tools20022.repository.choice.AcknowledgedAcceptedStatus15Choice acknowledgedAccepted) {
		this.acknowledgedAccepted = acknowledgedAccepted;
	}

	@XmlElement(name = "PdgPrcg", required = true)
	public PendingProcessingStatus8Choice getPendingProcessing() {
		return pendingProcessing;
	}

	public void setPendingProcessing(com.tools20022.repository.choice.PendingProcessingStatus8Choice pendingProcessing) {
		this.pendingProcessing = pendingProcessing;
	}

	@XmlElement(name = "Dnd", required = true)
	public DeniedStatus13Choice getDenied() {
		return denied;
	}

	public void setDenied(com.tools20022.repository.choice.DeniedStatus13Choice denied) {
		this.denied = denied;
	}

	@XmlElement(name = "Rjctd", required = true)
	public RejectionStatus10Choice getRejected() {
		return rejected;
	}

	public void setRejected(com.tools20022.repository.choice.RejectionStatus10Choice rejected) {
		this.rejected = rejected;
	}

	@XmlElement(name = "Rprd", required = true)
	public RepairStatus9Choice getRepaired() {
		return repaired;
	}

	public void setRepaired(com.tools20022.repository.choice.RepairStatus9Choice repaired) {
		this.repaired = repaired;
	}

	@XmlElement(name = "Modfd", required = true)
	public ModificationStatus3Choice getModified() {
		return modified;
	}

	public void setModified(com.tools20022.repository.choice.ModificationStatus3Choice modified) {
		this.modified = modified;
	}

	@XmlElement(name = "Prtry", required = true)
	public ProprietaryStatusAndReason2 getProprietary() {
		return proprietary;
	}

	public void setProprietary(ProprietaryStatusAndReason2 proprietary) {
		this.proprietary = proprietary;
	}
}