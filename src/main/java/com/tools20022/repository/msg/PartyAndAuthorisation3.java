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
import com.tools20022.repository.choice.PartyOrGroup1Choice;
import com.tools20022.repository.codeset.Modification1Code;
import com.tools20022.repository.datatype.Max15PlusSignedNumericText;
import com.tools20022.repository.entity.BankOperation;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.SignatureCondition;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Party and related authorisation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyAndAuthorisation3#mmModificationCode
 * PartyAndAuthorisation3.mmModificationCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyAndAuthorisation3#mmPartyOrGroup
 * PartyAndAuthorisation3.mmPartyOrGroup}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyAndAuthorisation3#mmSignatureOrder
 * PartyAndAuthorisation3.mmSignatureOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyAndAuthorisation3#mmAuthorisation
 * PartyAndAuthorisation3.mmAuthorisation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Party Party}</li>
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
 * "PartyAndAuthorisation3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Party and related authorisation."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PartyAndAuthorisation1
 * PartyAndAuthorisation1}</li>
 * </ul>
 */
public class PartyAndAuthorisation3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Modification1Code modificationCode;
	/**
	 * Specifies the type of change.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Modification1Code
	 * Modification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyAndAuthorisation3
	 * PartyAndAuthorisation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModificationCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of change."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmModificationCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PartyAndAuthorisation3.mmObject();
			isDerived = false;
			xmlTag = "ModCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationCode";
			definition = "Specifies the type of change.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Modification1Code.mmObject();
		}
	};
	protected PartyOrGroup1Choice partyOrGroup;
	/**
	 * Specifies a party or a group of parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PartyOrGroup1Choice
	 * PartyOrGroup1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyAndAuthorisation3
	 * PartyAndAuthorisation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtyOrGrp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyOrGroup"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies a party or a group of parties."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPartyOrGroup = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Party.mmObject();
			componentContext_lazy = () -> PartyAndAuthorisation3.mmObject();
			isDerived = false;
			xmlTag = "PtyOrGrp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyOrGroup";
			definition = "Specifies a party or a group of parties.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyOrGroup1Choice.mmObject();
		}
	};
	protected Max15PlusSignedNumericText signatureOrder;
	/**
	 * Order in which the mandate holder has to sign.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15PlusSignedNumericText
	 * Max15PlusSignedNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SignatureCondition#mmSignatureOrder
	 * SignatureCondition.mmSignatureOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyAndAuthorisation3
	 * PartyAndAuthorisation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SgntrOrdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order in which the mandate holder has to sign."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSignatureOrder = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SignatureCondition.mmSignatureOrder;
			componentContext_lazy = () -> PartyAndAuthorisation3.mmObject();
			isDerived = false;
			xmlTag = "SgntrOrdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureOrder";
			definition = "Order in which the mandate holder has to sign.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15PlusSignedNumericText.mmObject();
		}
	};
	protected Authorisation2 authorisation;
	/**
	 * Authorisation granted to a mandate holder.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Authorisation2
	 * Authorisation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BankOperation#mmOperationThreshold
	 * BankOperation.mmOperationThreshold}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyAndAuthorisation3
	 * PartyAndAuthorisation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Authstn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Authorisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Authorisation granted to a mandate holder."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAuthorisation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> BankOperation.mmOperationThreshold;
			componentContext_lazy = () -> PartyAndAuthorisation3.mmObject();
			isDerived = false;
			xmlTag = "Authstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Authorisation";
			definition = "Authorisation granted to a mandate holder.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Authorisation2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PartyAndAuthorisation3.mmModificationCode, PartyAndAuthorisation3.mmPartyOrGroup, PartyAndAuthorisation3.mmSignatureOrder, PartyAndAuthorisation3.mmAuthorisation);
				trace_lazy = () -> Party.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyAndAuthorisation3";
				definition = "Party and related authorisation.";
				previousVersion_lazy = () -> PartyAndAuthorisation1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Modification1Code getModificationCode() {
		return modificationCode;
	}

	public void setModificationCode(Modification1Code modificationCode) {
		this.modificationCode = modificationCode;
	}

	public PartyOrGroup1Choice getPartyOrGroup() {
		return partyOrGroup;
	}

	public void setPartyOrGroup(PartyOrGroup1Choice partyOrGroup) {
		this.partyOrGroup = partyOrGroup;
	}

	public Max15PlusSignedNumericText getSignatureOrder() {
		return signatureOrder;
	}

	public void setSignatureOrder(Max15PlusSignedNumericText signatureOrder) {
		this.signatureOrder = signatureOrder;
	}

	public Authorisation2 getAuthorisation() {
		return authorisation;
	}

	public void setAuthorisation(com.tools20022.repository.msg.Authorisation2 authorisation) {
		this.authorisation = authorisation;
	}
}