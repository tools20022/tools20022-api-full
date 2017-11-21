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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.codeset.RejectionReason1Code;
import com.tools20022.repository.datatype.Extended350Code;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
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
 * Status advising on the rejection of the instruction or cancellation request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructionRejectionStatus1#mmReasonOrExtendedReasonRule
 * InstructionRejectionStatus1.mmReasonOrExtendedReasonRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructionRejectionStatus1#mmReason
 * InstructionRejectionStatus1.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructionRejectionStatus1#mmExtendedReason
 * InstructionRejectionStatus1.mmExtendedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructionRejectionStatus1#mmAdditionalInformation
 * InstructionRejectionStatus1.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.StatusReason
 * StatusReason}</li>
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
 * "InstructionRejectionStatus1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Status advising on the rejection of the instruction or cancellation request."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "InstructionRejectionStatus1", propOrder = {"reason", "extendedReason", "additionalInformation"})
public class InstructionRejectionStatus1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected RejectionReason1Code reason;
	/**
	 * Reason advising the rejection of the instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason1Code
	 * RejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRejectionReason
	 * StatusReason.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstructionRejectionStatus1
	 * InstructionRejectionStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason advising the rejection of the instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReason = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmRejectionReason;
			componentContext_lazy = () -> InstructionRejectionStatus1.mmObject();
			isDerived = false;
			xmlTag = "Rsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "Reason advising the rejection of the instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RejectionReason1Code.mmObject();
		}
	};
	protected Extended350Code extendedReason;
	/**
	 * This code can be used in case another reason is required.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Extended350Code
	 * Extended350Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRejectionReason
	 * StatusReason.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstructionRejectionStatus1
	 * InstructionRejectionStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "This code can be used in case another reason is required."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExtendedReason = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmRejectionReason;
			componentContext_lazy = () -> InstructionRejectionStatus1.mmObject();
			isDerived = false;
			xmlTag = "XtndedRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedReason";
			definition = "This code can be used in case another reason is required.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}
	};
	protected Max350Text additionalInformation;
	/**
	 * Additional information about the reason.
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
	 * {@linkplain com.tools20022.repository.msg.InstructionRejectionStatus1
	 * InstructionRejectionStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional information about the reason."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InstructionRejectionStatus1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information about the reason.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Either Reason or ExtendedReason must be present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.InstructionRejectionStatus1
	 * InstructionRejectionStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructionRejectionStatus1#mmReason
	 * InstructionRejectionStatus1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructionRejectionStatus1#mmExtendedReason
	 * InstructionRejectionStatus1.mmExtendedReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReasonOrExtendedReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either Reason or ExtendedReason must be present, but not both."</li>
	 * </ul>
	 */
	public static final MMXor mmReasonOrExtendedReasonRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReasonOrExtendedReasonRule";
			definition = "Either Reason or ExtendedReason must be present, but not both.";
			messageComponent_lazy = () -> InstructionRejectionStatus1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(InstructionRejectionStatus1.mmReason, InstructionRejectionStatus1.mmExtendedReason);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(InstructionRejectionStatus1.mmReason, InstructionRejectionStatus1.mmExtendedReason, InstructionRejectionStatus1.mmAdditionalInformation);
				trace_lazy = () -> StatusReason.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "InstructionRejectionStatus1";
				definition = "Status advising on the rejection of the instruction or cancellation request.";
				xors_lazy = () -> Arrays.asList(InstructionRejectionStatus1.mmReasonOrExtendedReasonRule);
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Rsn", required = true)
	public RejectionReason1Code getReason() {
		return reason;
	}

	public void setReason(RejectionReason1Code reason) {
		this.reason = reason;
	}

	@XmlElement(name = "XtndedRsn", required = true)
	public Extended350Code getExtendedReason() {
		return extendedReason;
	}

	public void setExtendedReason(Extended350Code extendedReason) {
		this.extendedReason = extendedReason;
	}

	@XmlElement(name = "AddtlInf")
	public Max350Text getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(Max350Text additionalInformation) {
		this.additionalInformation = additionalInformation;
	}
}