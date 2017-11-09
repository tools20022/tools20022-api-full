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
import com.tools20022.repository.entity.CardPaymentValidation;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Outcome of the authorisation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AuthorisationResult11#mmAuthorisationEntity
 * AuthorisationResult11.mmAuthorisationEntity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AuthorisationResult11#mmResponseToAuthorisation
 * AuthorisationResult11.mmResponseToAuthorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AuthorisationResult11#mmAuthorisationCode
 * AuthorisationResult11.mmAuthorisationCode}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPaymentValidation
 * CardPaymentValidation}</li>
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
 * "AuthorisationResult11"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Outcome of the authorisation."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AuthorisationResult5
 * AuthorisationResult5}</li>
 * </ul>
 */
public class AuthorisationResult11 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected GenericIdentification90 authorisationEntity;
	/**
	 * Type of party that has delivered or declined the card payment
	 * authorisation (the party is not identified).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification90
	 * GenericIdentification90}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult11
	 * AuthorisationResult11}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult5#mmAuthorisationEntity
	 * AuthorisationResult5.mmAuthorisationEntity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAuthorisationEntity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> AuthorisationResult11.mmObject();
			isDerived = false;
			xmlTag = "AuthstnNtty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationEntity";
			definition = "Type of party that has delivered or declined the card payment authorisation (the party is not identified).";
			previousVersion_lazy = () -> AuthorisationResult5.mmAuthorisationEntity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification90.mmObject();
		}
	};
	protected ResponseType5 responseToAuthorisation;
	/**
	 * Response to an authorisation request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ResponseType5
	 * ResponseType5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmResponse
	 * CardPaymentValidation.mmResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult11
	 * AuthorisationResult11}</li>
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
	 * definition} = "Response to an authorisation request."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult5#mmResponseToAuthorisation
	 * AuthorisationResult5.mmResponseToAuthorisation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmResponseToAuthorisation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CardPaymentValidation.mmResponse;
			componentContext_lazy = () -> AuthorisationResult11.mmObject();
			isDerived = false;
			xmlTag = "RspnToAuthstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseToAuthorisation";
			definition = "Response to an authorisation request.";
			previousVersion_lazy = () -> AuthorisationResult5.mmResponseToAuthorisation;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ResponseType5.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult11
	 * AuthorisationResult11}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult5#mmAuthorisationCode
	 * AuthorisationResult5.mmAuthorisationCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAuthorisationCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPaymentValidation.mmAuthorisationCode;
			componentContext_lazy = () -> AuthorisationResult11.mmObject();
			isDerived = false;
			xmlTag = "AuthstnCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationCode";
			definition = "Value assigned by the authorising party.";
			previousVersion_lazy = () -> AuthorisationResult5.mmAuthorisationCode;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Min6Max8Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AuthorisationResult11.mmAuthorisationEntity, AuthorisationResult11.mmResponseToAuthorisation, AuthorisationResult11.mmAuthorisationCode);
				trace_lazy = () -> CardPaymentValidation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AuthorisationResult11";
				definition = "Outcome of the authorisation.";
				previousVersion_lazy = () -> AuthorisationResult5.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public GenericIdentification90 getAuthorisationEntity() {
		return authorisationEntity;
	}

	public void setAuthorisationEntity(com.tools20022.repository.msg.GenericIdentification90 authorisationEntity) {
		this.authorisationEntity = authorisationEntity;
	}

	public ResponseType5 getResponseToAuthorisation() {
		return responseToAuthorisation;
	}

	public void setResponseToAuthorisation(com.tools20022.repository.msg.ResponseType5 responseToAuthorisation) {
		this.responseToAuthorisation = responseToAuthorisation;
	}

	public Min6Max8Text getAuthorisationCode() {
		return authorisationCode;
	}

	public void setAuthorisationCode(Min6Max8Text authorisationCode) {
		this.authorisationCode = authorisationCode;
	}
}