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
import com.tools20022.repository.area.acmt.*;
import com.tools20022.repository.choice.PartyIdentification2Choice;
import com.tools20022.repository.codeset.CommunicationMethod1Code;
import com.tools20022.repository.datatype.Extended350Code;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;

/**
 * Determine the type of document and the type of communication method to be
 * used to notify a Party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentToSend1#mmMethodOfTransmissionXorExtendedMethodOfTransmissionRule
 * DocumentToSend1.mmMethodOfTransmissionXorExtendedMethodOfTransmissionRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentToSend1#mmType
 * DocumentToSend1.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentToSend1#mmRecipient
 * DocumentToSend1.mmRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentToSend1#mmMethodOfTransmission
 * DocumentToSend1.mmMethodOfTransmission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentToSend1#mmExtendedMethodOfTransmission
 * DocumentToSend1.mmExtendedMethodOfTransmission}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02#mmServiceLevelAgreement
 * AccountDetailsConfirmationV02.mmServiceLevelAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03#mmServiceLevelAgreement
 * AccountDetailsConfirmationV03.mmServiceLevelAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV02#mmServiceLevelAgreement
 * AccountOpeningInstructionV02.mmServiceLevelAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV03#mmServiceLevelAgreement
 * AccountOpeningInstructionV03.mmServiceLevelAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04#mmServiceLevelAgreement
 * AccountDetailsConfirmationV04.mmServiceLevelAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV04#mmServiceLevelAgreement
 * AccountOpeningInstructionV04.mmServiceLevelAgreement}</li>
 * </ul>
 * </li>
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
 * "DocumentToSend1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Determine the type of document and the type of communication method to be used to notify a Party."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentToSend2
 * DocumentToSend2}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class DocumentToSend1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max140Text type;
	/**
	 * Type of document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DocumentToSend1
	 * DocumentToSend1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of document."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.DocumentToSend2#mmType
	 * DocumentToSend2.mmType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DocumentToSend1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of document.";
			nextVersions_lazy = () -> Arrays.asList(DocumentToSend2.mmType);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected PartyIdentification2Choice recipient;
	/**
	 * Party that should receive the document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
	 * PartyIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DocumentToSend1
	 * DocumentToSend1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rcpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Recipient"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that should receive the document."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentToSend2#mmRecipient
	 * DocumentToSend2.mmRecipient}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRecipient = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DocumentToSend1.mmObject();
			isDerived = false;
			xmlTag = "Rcpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Recipient";
			definition = "Party that should receive the document.";
			nextVersions_lazy = () -> Arrays.asList(DocumentToSend2.mmRecipient);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification2Choice.mmObject();
		}
	};
	protected CommunicationMethod1Code methodOfTransmission;
	/**
	 * Communication method to be used.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod1Code
	 * CommunicationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DocumentToSend1
	 * DocumentToSend1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtdOfTrnsmssn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MethodOfTransmission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Communication method to be used."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMethodOfTransmission = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DocumentToSend1.mmObject();
			isDerived = false;
			xmlTag = "MtdOfTrnsmssn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MethodOfTransmission";
			definition = "Communication method to be used.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CommunicationMethod1Code.mmObject();
		}
	};
	protected Extended350Code extendedMethodOfTransmission;
	/**
	 * Communication means used to send information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Extended350Code
	 * Extended350Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DocumentToSend1
	 * DocumentToSend1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedMtdOfTrnsmssn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedMethodOfTransmission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Communication means used to send information."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExtendedMethodOfTransmission = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DocumentToSend1.mmObject();
			isDerived = false;
			xmlTag = "XtndedMtdOfTrnsmssn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedMethodOfTransmission";
			definition = "Communication means used to send information.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}
	};
	/**
	 * Either MethodOfTransmission or ExtendedMethodOfTransmission must be
	 * present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.DocumentToSend1
	 * DocumentToSend1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentToSend1#mmMethodOfTransmission
	 * DocumentToSend1.mmMethodOfTransmission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentToSend1#mmExtendedMethodOfTransmission
	 * DocumentToSend1.mmExtendedMethodOfTransmission}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MethodOfTransmissionXorExtendedMethodOfTransmissionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either MethodOfTransmission or ExtendedMethodOfTransmission must be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor mmMethodOfTransmissionXorExtendedMethodOfTransmissionRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MethodOfTransmissionXorExtendedMethodOfTransmissionRule";
			definition = "Either MethodOfTransmission or ExtendedMethodOfTransmission must be present, but not both.";
			messageComponent_lazy = () -> DocumentToSend1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(DocumentToSend1.mmMethodOfTransmission, DocumentToSend1.mmExtendedMethodOfTransmission);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(DocumentToSend1.mmType, DocumentToSend1.mmRecipient, DocumentToSend1.mmMethodOfTransmission, DocumentToSend1.mmExtendedMethodOfTransmission);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountDetailsConfirmationV02.mmServiceLevelAgreement, AccountDetailsConfirmationV03.mmServiceLevelAgreement, AccountOpeningInstructionV02.mmServiceLevelAgreement,
						AccountOpeningInstructionV03.mmServiceLevelAgreement, AccountDetailsConfirmationV04.mmServiceLevelAgreement, AccountOpeningInstructionV04.mmServiceLevelAgreement);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "DocumentToSend1";
				definition = "Determine the type of document and the type of communication method to be used to notify a Party.";
				nextVersions_lazy = () -> Arrays.asList(DocumentToSend2.mmObject());
				xors_lazy = () -> Arrays.asList(DocumentToSend1.mmMethodOfTransmissionXorExtendedMethodOfTransmissionRule);
			}
		});
		return mmObject_lazy.get();
	}

	public Max140Text getType() {
		return type;
	}

	public void setType(Max140Text type) {
		this.type = type;
	}

	public PartyIdentification2Choice getRecipient() {
		return recipient;
	}

	public void setRecipient(PartyIdentification2Choice recipient) {
		this.recipient = recipient;
	}

	public CommunicationMethod1Code getMethodOfTransmission() {
		return methodOfTransmission;
	}

	public void setMethodOfTransmission(CommunicationMethod1Code methodOfTransmission) {
		this.methodOfTransmission = methodOfTransmission;
	}

	public Extended350Code getExtendedMethodOfTransmission() {
		return extendedMethodOfTransmission;
	}

	public void setExtendedMethodOfTransmission(Extended350Code extendedMethodOfTransmission) {
		this.extendedMethodOfTransmission = extendedMethodOfTransmission;
	}
}