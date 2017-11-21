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
import com.tools20022.repository.datatype.BICIdentifier;
import com.tools20022.repository.entity.Organisation;
import com.tools20022.repository.entity.PaymentPartyRole;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the party fields used to search for a payment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionParty#mmDebtor
 * PaymentTransactionParty.mmDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionParty#mmFirstAgent
 * PaymentTransactionParty.mmFirstAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionParty#mmInstructingAgentCorrespondent
 * PaymentTransactionParty.mmInstructingAgentCorrespondent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionParty#mmInstructedAgentCorrespondent
 * PaymentTransactionParty.mmInstructedAgentCorrespondent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionParty#mmIntermediary
 * PaymentTransactionParty.mmIntermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionParty#mmFinalAgent
 * PaymentTransactionParty.mmFinalAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionParty#mmCreditor
 * PaymentTransactionParty.mmCreditor}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentPartyRole
 * PaymentPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentTransactionParty"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the party fields used to search for a payment."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PaymentTransactionParty", propOrder = {"debtor", "firstAgent", "instructingAgentCorrespondent", "instructedAgentCorrespondent", "intermediary", "finalAgent", "creditor"})
public class PaymentTransactionParty {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected BICIdentifier debtor;
	/**
	 * Party that owes assets to the creditor, eg, as a result of receipt of
	 * goods or services, gifts, or charity payments. The debtor may also be the
	 * debit account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BICIdentifier
	 * BICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionParty
	 * PaymentTransactionParty}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dbtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Debtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that owes assets to the creditor, eg, as a result of receipt of goods or services, gifts, or charity payments. The debtor may also be the debit account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDebtor = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> PaymentTransactionParty.mmObject();
			isDerived = false;
			xmlTag = "Dbtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Debtor";
			definition = "Party that owes assets to the creditor, eg, as a result of receipt of goods or services, gifts, or charity payments. The debtor may also be the debit account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BICIdentifier.mmObject();
		}
	};
	protected BICIdentifier firstAgent;
	/**
	 * Financial institution that receives the payment transaction from the
	 * account owner, or other authorised party, and processes the instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BICIdentifier
	 * BICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionParty
	 * PaymentTransactionParty}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrstAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution that receives the payment transaction from the account owner, or other authorised party, and processes the instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFirstAgent = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> PaymentTransactionParty.mmObject();
			isDerived = false;
			xmlTag = "FrstAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstAgent";
			definition = "Financial institution that receives the payment transaction from the account owner, or other authorised party, and processes the instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BICIdentifier.mmObject();
		}
	};
	protected BICIdentifier instructingAgentCorrespondent;
	/**
	 * Correspondent of the Instructing Agent that sends the payment
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BICIdentifier
	 * BICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionParty
	 * PaymentTransactionParty}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstgAgtCrspdt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructingAgentCorrespondent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Correspondent of the Instructing Agent that sends the payment instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructingAgentCorrespondent = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> PaymentTransactionParty.mmObject();
			isDerived = false;
			xmlTag = "InstgAgtCrspdt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructingAgentCorrespondent";
			definition = "Correspondent of the Instructing Agent that sends the payment instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BICIdentifier.mmObject();
		}
	};
	protected BICIdentifier instructedAgentCorrespondent;
	/**
	 * Correspondent of the Instructed Agent that receives the payment
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BICIdentifier
	 * BICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionParty
	 * PaymentTransactionParty}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdAgtCrspdt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAgentCorrespondent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Correspondent of the Instructed Agent that receives the payment instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructedAgentCorrespondent = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> PaymentTransactionParty.mmObject();
			isDerived = false;
			xmlTag = "InstdAgtCrspdt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAgentCorrespondent";
			definition = "Correspondent of the Instructed Agent that receives the payment instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BICIdentifier.mmObject();
		}
	};
	protected BICIdentifier intermediary;
	/**
	 * Party within the settlement chain between the first and final agents.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BICIdentifier
	 * BICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionParty
	 * PaymentTransactionParty}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Intrmy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Intermediary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party within the settlement chain between the first and final agents."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIntermediary = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> PaymentTransactionParty.mmObject();
			isDerived = false;
			xmlTag = "Intrmy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Intermediary";
			definition = "Party within the settlement chain between the first and final agents.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BICIdentifier.mmObject();
		}
	};
	protected BICIdentifier finalAgent;
	/**
	 * Financial institution that receives the payment transaction on behalf of
	 * an account owner, or other nominated party, and credits the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BICIdentifier
	 * BICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionParty
	 * PaymentTransactionParty}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FnlAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution that receives the payment transaction on behalf of an account owner, or other nominated party, and credits the account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFinalAgent = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> PaymentTransactionParty.mmObject();
			isDerived = false;
			xmlTag = "FnlAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalAgent";
			definition = "Financial institution that receives the payment transaction on behalf of an account owner, or other nominated party, and credits the account.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BICIdentifier.mmObject();
		}
	};
	protected BICIdentifier creditor;
	/**
	 * Party that receives an amount of money from the debtor. In the context of
	 * the payment model, the creditor is also the credit account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BICIdentifier
	 * BICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionParty
	 * PaymentTransactionParty}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cdtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Creditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that receives an amount of money from the debtor. In the context of the payment model, the creditor is also the credit account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreditor = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> PaymentTransactionParty.mmObject();
			isDerived = false;
			xmlTag = "Cdtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Creditor";
			definition = "Party that receives an amount of money from the debtor. In the context of the payment model, the creditor is also the credit account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BICIdentifier.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PaymentTransactionParty.mmDebtor, PaymentTransactionParty.mmFirstAgent, PaymentTransactionParty.mmInstructingAgentCorrespondent,
						PaymentTransactionParty.mmInstructedAgentCorrespondent, PaymentTransactionParty.mmIntermediary, PaymentTransactionParty.mmFinalAgent, PaymentTransactionParty.mmCreditor);
				trace_lazy = () -> PaymentPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PaymentTransactionParty";
				definition = "Defines the party fields used to search for a payment.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Dbtr")
	public BICIdentifier getDebtor() {
		return debtor;
	}

	public void setDebtor(BICIdentifier debtor) {
		this.debtor = debtor;
	}

	@XmlElement(name = "FrstAgt")
	public BICIdentifier getFirstAgent() {
		return firstAgent;
	}

	public void setFirstAgent(BICIdentifier firstAgent) {
		this.firstAgent = firstAgent;
	}

	@XmlElement(name = "InstgAgtCrspdt")
	public BICIdentifier getInstructingAgentCorrespondent() {
		return instructingAgentCorrespondent;
	}

	public void setInstructingAgentCorrespondent(BICIdentifier instructingAgentCorrespondent) {
		this.instructingAgentCorrespondent = instructingAgentCorrespondent;
	}

	@XmlElement(name = "InstdAgtCrspdt")
	public BICIdentifier getInstructedAgentCorrespondent() {
		return instructedAgentCorrespondent;
	}

	public void setInstructedAgentCorrespondent(BICIdentifier instructedAgentCorrespondent) {
		this.instructedAgentCorrespondent = instructedAgentCorrespondent;
	}

	@XmlElement(name = "Intrmy")
	public BICIdentifier getIntermediary() {
		return intermediary;
	}

	public void setIntermediary(BICIdentifier intermediary) {
		this.intermediary = intermediary;
	}

	@XmlElement(name = "FnlAgt")
	public BICIdentifier getFinalAgent() {
		return finalAgent;
	}

	public void setFinalAgent(BICIdentifier finalAgent) {
		this.finalAgent = finalAgent;
	}

	@XmlElement(name = "Cdtr")
	public BICIdentifier getCreditor() {
		return creditor;
	}

	public void setCreditor(BICIdentifier creditor) {
		this.creditor = creditor;
	}
}