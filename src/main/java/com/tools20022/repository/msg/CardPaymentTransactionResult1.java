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
import com.tools20022.repository.datatype.Min6Max8Text;
import com.tools20022.repository.entity.AuthorisationEntity;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.entity.CardPaymentValidation;
import com.tools20022.repository.entity.Response;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Result of the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionResult1#mmAuthorisationEntity
 * CardPaymentTransactionResult1.mmAuthorisationEntity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionResult1#mmResponseToAuthorisation
 * CardPaymentTransactionResult1.mmResponseToAuthorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionResult1#mmAuthorisationCode
 * CardPaymentTransactionResult1.mmAuthorisationCode}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPayment
 * CardPayment}</li>
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
 * "CardPaymentTransactionResult1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Result of the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransactionResult2
 * CardPaymentTransactionResult2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CardPaymentTransactionResult1", propOrder = {"authorisationEntity", "responseToAuthorisation", "authorisationCode"})
public class CardPaymentTransactionResult1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected GenericIdentification33 authorisationEntity;
	/**
	 * Type of party that has delivered or declined the card payment
	 * authorisation (the party is not identified).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification33
	 * GenericIdentification33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AuthorisationEntity
	 * AuthorisationEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionResult1
	 * CardPaymentTransactionResult1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthstnNtty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisationEntity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of party that has delivered or declined the card payment authorisation (the party is not identified)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionResult2#mmAuthorisationEntity
	 * CardPaymentTransactionResult2.mmAuthorisationEntity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAuthorisationEntity = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> AuthorisationEntity.mmObject();
			componentContext_lazy = () -> CardPaymentTransactionResult1.mmObject();
			isDerived = false;
			xmlTag = "AuthstnNtty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationEntity";
			definition = "Type of party that has delivered or declined the card payment authorisation (the party is not identified).";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionResult2.mmAuthorisationEntity);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification33.mmObject();
		}
	};
	protected ResponseType1 responseToAuthorisation;
	/**
	 * Response to an authorisation from the acquirer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ResponseType1
	 * ResponseType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Response#mmResponseToAuthorisation
	 * Response.mmResponseToAuthorisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionResult1
	 * CardPaymentTransactionResult1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RspnToAuthstn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponseToAuthorisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Response to an authorisation from the acquirer."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionResult2#mmResponseToAuthorisation
	 * CardPaymentTransactionResult2.mmResponseToAuthorisation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmResponseToAuthorisation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Response.mmResponseToAuthorisation;
			componentContext_lazy = () -> CardPaymentTransactionResult1.mmObject();
			isDerived = false;
			xmlTag = "RspnToAuthstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseToAuthorisation";
			definition = "Response to an authorisation from the acquirer.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionResult2.mmResponseToAuthorisation);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ResponseType1.mmObject();
		}
	};
	protected Min6Max8Text authorisationCode;
	/**
	 * Value assigned by the authorising party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Min6Max8Text Min6Max8Text}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmAuthorisationCode
	 * CardPaymentValidation.mmAuthorisationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionResult1
	 * CardPaymentTransactionResult1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthstnCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisationCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value assigned by the authorising party."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionResult2#mmAuthorisationCode
	 * CardPaymentTransactionResult2.mmAuthorisationCode}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAuthorisationCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPaymentValidation.mmAuthorisationCode;
			componentContext_lazy = () -> CardPaymentTransactionResult1.mmObject();
			isDerived = false;
			xmlTag = "AuthstnCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationCode";
			definition = "Value assigned by the authorising party.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionResult2.mmAuthorisationCode);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Min6Max8Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CardPaymentTransactionResult1.mmAuthorisationEntity, CardPaymentTransactionResult1.mmResponseToAuthorisation, CardPaymentTransactionResult1.mmAuthorisationCode);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentTransactionResult1";
				definition = "Result of the transaction.";
				nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionResult2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AuthstnNtty")
	public GenericIdentification33 getAuthorisationEntity() {
		return authorisationEntity;
	}

	public void setAuthorisationEntity(com.tools20022.repository.msg.GenericIdentification33 authorisationEntity) {
		this.authorisationEntity = authorisationEntity;
	}

	@XmlElement(name = "RspnToAuthstn", required = true)
	public ResponseType1 getResponseToAuthorisation() {
		return responseToAuthorisation;
	}

	public void setResponseToAuthorisation(com.tools20022.repository.msg.ResponseType1 responseToAuthorisation) {
		this.responseToAuthorisation = responseToAuthorisation;
	}

	@XmlElement(name = "AuthstnCd")
	public Min6Max8Text getAuthorisationCode() {
		return authorisationCode;
	}

	public void setAuthorisationCode(Min6Max8Text authorisationCode) {
		this.authorisationCode = authorisationCode;
	}
}