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
import com.tools20022.repository.codeset.PartyType16Code;
import com.tools20022.repository.datatype.Min6Max8Text;
import com.tools20022.repository.entity.CardPaymentValidation;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Action7;
import com.tools20022.repository.msg.ResponseType7;
import com.tools20022.repository.msg.ResponseType8;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Outcome of the withdrawal authorisation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AuthorisationResult13#mmAuthorisationEntity
 * AuthorisationResult13.mmAuthorisationEntity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AuthorisationResult13#mmAuthorisationResponse
 * AuthorisationResult13.mmAuthorisationResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AuthorisationResult13#mmResponseTrace
 * AuthorisationResult13.mmResponseTrace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AuthorisationResult13#mmAuthorisationCode
 * AuthorisationResult13.mmAuthorisationCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AuthorisationResult13#mmAction
 * AuthorisationResult13.mmAction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPaymentValidation
 * CardPaymentValidation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AuthorisationResult13"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Outcome of the withdrawal authorisation."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AuthorisationResult13", propOrder = {"authorisationEntity", "authorisationResponse", "responseTrace", "authorisationCode", "action"})
public class AuthorisationResult13 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AuthstnNtty")
	protected PartyType16Code authorisationEntity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType16Code
	 * PartyType16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult13
	 * AuthorisationResult13}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<AuthorisationResult13, Optional<PartyType16Code>> mmAuthorisationEntity = new MMMessageAttribute<AuthorisationResult13, Optional<PartyType16Code>>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AuthorisationResult13.mmObject();
			isDerived = false;
			xmlTag = "AuthstnNtty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationEntity";
			definition = "Type of party that has delivered or declined the card payment authorisation (the party is not identified).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PartyType16Code.mmObject();
		}

		@Override
		public Optional<PartyType16Code> getValue(AuthorisationResult13 obj) {
			return obj.getAuthorisationEntity();
		}

		@Override
		public void setValue(AuthorisationResult13 obj, Optional<PartyType16Code> value) {
			obj.setAuthorisationEntity(value.orElse(null));
		}
	};
	@XmlElement(name = "AuthstnRspn", required = true)
	protected ResponseType7 authorisationResponse;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ResponseType7
	 * ResponseType7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmResponse
	 * CardPaymentValidation.mmResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult13
	 * AuthorisationResult13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthstnRspn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisationResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Result of the authorisation."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AuthorisationResult13, ResponseType7> mmAuthorisationResponse = new MMMessageAssociationEnd<AuthorisationResult13, ResponseType7>() {
		{
			businessElementTrace_lazy = () -> CardPaymentValidation.mmResponse;
			componentContext_lazy = () -> com.tools20022.repository.msg.AuthorisationResult13.mmObject();
			isDerived = false;
			xmlTag = "AuthstnRspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationResponse";
			definition = "Result of the authorisation.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ResponseType7.mmObject();
		}

		@Override
		public ResponseType7 getValue(AuthorisationResult13 obj) {
			return obj.getAuthorisationResponse();
		}

		@Override
		public void setValue(AuthorisationResult13 obj, ResponseType7 value) {
			obj.setAuthorisationResponse(value);
		}
	};
	@XmlElement(name = "RspnTrac")
	protected List<ResponseType8> responseTrace;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ResponseType8
	 * ResponseType8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult13
	 * AuthorisationResult13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RspnTrac"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponseTrace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trace of response by the entities in the path from the issuer to the ATM."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AuthorisationResult13, List<ResponseType8>> mmResponseTrace = new MMMessageAssociationEnd<AuthorisationResult13, List<ResponseType8>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AuthorisationResult13.mmObject();
			isDerived = false;
			xmlTag = "RspnTrac";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseTrace";
			definition = "Trace of response by the entities in the path from the issuer to the ATM.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ResponseType8.mmObject();
		}

		@Override
		public List<ResponseType8> getValue(AuthorisationResult13 obj) {
			return obj.getResponseTrace();
		}

		@Override
		public void setValue(AuthorisationResult13 obj, List<ResponseType8> value) {
			obj.setResponseTrace(value);
		}
	};
	@XmlElement(name = "AuthstnCd")
	protected Min6Max8Text authorisationCode;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult13
	 * AuthorisationResult13}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<AuthorisationResult13, Optional<Min6Max8Text>> mmAuthorisationCode = new MMMessageAttribute<AuthorisationResult13, Optional<Min6Max8Text>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentValidation.mmAuthorisationCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.AuthorisationResult13.mmObject();
			isDerived = false;
			xmlTag = "AuthstnCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationCode";
			definition = "Value assigned by the authorising party.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Min6Max8Text.mmObject();
		}

		@Override
		public Optional<Min6Max8Text> getValue(AuthorisationResult13 obj) {
			return obj.getAuthorisationCode();
		}

		@Override
		public void setValue(AuthorisationResult13 obj, Optional<Min6Max8Text> value) {
			obj.setAuthorisationCode(value.orElse(null));
		}
	};
	@XmlElement(name = "Actn")
	protected List<Action7> action;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Action7 Action7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmCardPayment
	 * CardPaymentValidation.mmCardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult13
	 * AuthorisationResult13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Actn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Action"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sequence of actions to be performed by the ATM to complete the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AuthorisationResult13, List<Action7>> mmAction = new MMMessageAssociationEnd<AuthorisationResult13, List<Action7>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentValidation.mmCardPayment;
			componentContext_lazy = () -> com.tools20022.repository.msg.AuthorisationResult13.mmObject();
			isDerived = false;
			xmlTag = "Actn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Action";
			definition = "Sequence of actions to be performed by the ATM to complete the transaction.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Action7.mmObject();
		}

		@Override
		public List<Action7> getValue(AuthorisationResult13 obj) {
			return obj.getAction();
		}

		@Override
		public void setValue(AuthorisationResult13 obj, List<Action7> value) {
			obj.setAction(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AuthorisationResult13.mmAuthorisationEntity, com.tools20022.repository.msg.AuthorisationResult13.mmAuthorisationResponse,
						com.tools20022.repository.msg.AuthorisationResult13.mmResponseTrace, com.tools20022.repository.msg.AuthorisationResult13.mmAuthorisationCode, com.tools20022.repository.msg.AuthorisationResult13.mmAction);
				trace_lazy = () -> CardPaymentValidation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AuthorisationResult13";
				definition = "Outcome of the withdrawal authorisation.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PartyType16Code> getAuthorisationEntity() {
		return authorisationEntity == null ? Optional.empty() : Optional.of(authorisationEntity);
	}

	public AuthorisationResult13 setAuthorisationEntity(PartyType16Code authorisationEntity) {
		this.authorisationEntity = authorisationEntity;
		return this;
	}

	public ResponseType7 getAuthorisationResponse() {
		return authorisationResponse;
	}

	public AuthorisationResult13 setAuthorisationResponse(ResponseType7 authorisationResponse) {
		this.authorisationResponse = Objects.requireNonNull(authorisationResponse);
		return this;
	}

	public List<ResponseType8> getResponseTrace() {
		return responseTrace == null ? responseTrace = new ArrayList<>() : responseTrace;
	}

	public AuthorisationResult13 setResponseTrace(List<ResponseType8> responseTrace) {
		this.responseTrace = Objects.requireNonNull(responseTrace);
		return this;
	}

	public Optional<Min6Max8Text> getAuthorisationCode() {
		return authorisationCode == null ? Optional.empty() : Optional.of(authorisationCode);
	}

	public AuthorisationResult13 setAuthorisationCode(Min6Max8Text authorisationCode) {
		this.authorisationCode = authorisationCode;
		return this;
	}

	public List<Action7> getAction() {
		return action == null ? action = new ArrayList<>() : action;
	}

	public AuthorisationResult13 setAction(List<Action7> action) {
		this.action = Objects.requireNonNull(action);
		return this;
	}
}