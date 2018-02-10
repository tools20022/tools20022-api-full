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

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.RestrictedProprietaryChoice;
import com.tools20022.repository.codeset.ClearingChannel2Code;
import com.tools20022.repository.codeset.Priority2Code;
import com.tools20022.repository.entity.PaymentProcessing;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements that further details the information related to the type of
 * payment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation5#ServiceLevelOrClearingChannelRule
 * PaymentTypeInformation5.ServiceLevelOrClearingChannelRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation5#mmInstructionPriority
 * PaymentTypeInformation5.mmInstructionPriority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation5#mmServiceLevel
 * PaymentTypeInformation5.mmServiceLevel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation5#mmClearingChannel
 * PaymentTypeInformation5.mmClearingChannel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation5#mmLocalInstrument
 * PaymentTypeInformation5.mmLocalInstrument}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentProcessing
 * PaymentProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentTypeInformation5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements that further details the information related to the type of payment."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentTypeInformation5", propOrder = {"instructionPriority", "serviceLevel", "clearingChannel", "localInstrument"})
public class PaymentTypeInformation5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "InstrPrty")
	protected Priority2Code instructionPriority;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Priority2Code
	 * Priority2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmPriority
	 * PaymentProcessing.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation5
	 * PaymentTypeInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrPrty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionPriority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicator of the urgency or order of importance that the instructing party would like the instructed party to apply to the processing of the instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructionPriority = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentProcessing.mmPriority;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTypeInformation5.mmObject();
			isDerived = false;
			xmlTag = "InstrPrty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionPriority";
			definition = "Indicator of the urgency or order of importance that the instructing party would like the instructed party to apply to the processing of the instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Priority2Code.mmObject();
		}
	};
	@XmlElement(name = "SvcLvl")
	protected RestrictedProprietaryChoice serviceLevel;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RestrictedProprietaryChoice
	 * RestrictedProprietaryChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmServiceLevel
	 * PaymentProcessing.mmServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation5
	 * PaymentTypeInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcLvl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceLevel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agreement under which or rules under which the transaction should be processed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmServiceLevel = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentProcessing.mmServiceLevel;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTypeInformation5.mmObject();
			isDerived = false;
			xmlTag = "SvcLvl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceLevel";
			definition = "Agreement under which or rules under which the transaction should be processed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RestrictedProprietaryChoice.mmObject();
		}
	};
	@XmlElement(name = "ClrChanl")
	protected ClearingChannel2Code clearingChannel;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingChannel2Code
	 * ClearingChannel2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmClearingChannel
	 * PaymentProcessing.mmClearingChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation5
	 * PaymentTypeInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrChanl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingChannel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the clearing channel to be used for the instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClearingChannel = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentProcessing.mmClearingChannel;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTypeInformation5.mmObject();
			isDerived = false;
			xmlTag = "ClrChanl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingChannel";
			definition = "Specifies the clearing channel to be used for the instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ClearingChannel2Code.mmObject();
		}
	};
	@XmlElement(name = "LclInstrm")
	protected RestrictedProprietaryChoice localInstrument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RestrictedProprietaryChoice
	 * RestrictedProprietaryChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmLocalInstrument
	 * PaymentProcessing.mmLocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation5
	 * PaymentTypeInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LclInstrm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "User community specific instrument required for use within that user community.\n\nUsage: When available, codes provided by local authorities should be used."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLocalInstrument = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentProcessing.mmLocalInstrument;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTypeInformation5.mmObject();
			isDerived = false;
			xmlTag = "LclInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalInstrument";
			definition = "User community specific instrument required for use within that user community.\n\nUsage: When available, codes provided by local authorities should be used.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RestrictedProprietaryChoice.mmObject();
		}
	};
	/**
	 * If ServiceLevel is present then ClearingChannel must is not allowed. If
	 * ClearingChannel is present then ServiceLevel must is not allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation5
	 * PaymentTypeInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation5#mmServiceLevel
	 * PaymentTypeInformation5.mmServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation5#mmClearingChannel
	 * PaymentTypeInformation5.mmClearingChannel}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceLevelOrClearingChannelRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ServiceLevel is present then ClearingChannel must is not allowed.\nIf ClearingChannel is present then ServiceLevel must is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMXor ServiceLevelOrClearingChannelRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceLevelOrClearingChannelRule";
			definition = "If ServiceLevel is present then ClearingChannel must is not allowed.\nIf ClearingChannel is present then ServiceLevel must is not allowed.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.PaymentTypeInformation5.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentTypeInformation5.mmServiceLevel, com.tools20022.repository.msg.PaymentTypeInformation5.mmClearingChannel);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentTypeInformation5.mmInstructionPriority, com.tools20022.repository.msg.PaymentTypeInformation5.mmServiceLevel,
						com.tools20022.repository.msg.PaymentTypeInformation5.mmClearingChannel, com.tools20022.repository.msg.PaymentTypeInformation5.mmLocalInstrument);
				trace_lazy = () -> PaymentProcessing.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "PaymentTypeInformation5";
				definition = "Set of elements that further details the information related to the type of payment.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentTypeInformation5.ServiceLevelOrClearingChannelRule);
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Priority2Code> getInstructionPriority() {
		return instructionPriority == null ? Optional.empty() : Optional.of(instructionPriority);
	}

	public PaymentTypeInformation5 setInstructionPriority(Priority2Code instructionPriority) {
		this.instructionPriority = instructionPriority;
		return this;
	}

	public Optional<RestrictedProprietaryChoice> getServiceLevel() {
		return serviceLevel == null ? Optional.empty() : Optional.of(serviceLevel);
	}

	public PaymentTypeInformation5 setServiceLevel(RestrictedProprietaryChoice serviceLevel) {
		this.serviceLevel = serviceLevel;
		return this;
	}

	public Optional<ClearingChannel2Code> getClearingChannel() {
		return clearingChannel == null ? Optional.empty() : Optional.of(clearingChannel);
	}

	public PaymentTypeInformation5 setClearingChannel(ClearingChannel2Code clearingChannel) {
		this.clearingChannel = clearingChannel;
		return this;
	}

	public Optional<RestrictedProprietaryChoice> getLocalInstrument() {
		return localInstrument == null ? Optional.empty() : Optional.of(localInstrument);
	}

	public PaymentTypeInformation5 setLocalInstrument(RestrictedProprietaryChoice localInstrument) {
		this.localInstrument = localInstrument;
		return this;
	}
}