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
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.CardPaymentAcquiring;
import com.tools20022.repository.entity.CardPaymentValidation;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification90;
import com.tools20022.repository.msg.ResponseType5;
import com.tools20022.repository.msg.TMSTrigger1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Outcome of the authorisation, and actions to perform.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AuthorisationResult10#mmAuthorisationEntity
 * AuthorisationResult10.mmAuthorisationEntity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AuthorisationResult10#mmResponseToAuthorisation
 * AuthorisationResult10.mmResponseToAuthorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AuthorisationResult10#mmAuthorisationCode
 * AuthorisationResult10.mmAuthorisationCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AuthorisationResult10#mmCompletionRequired
 * AuthorisationResult10.mmCompletionRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AuthorisationResult10#mmTMSTrigger
 * AuthorisationResult10.mmTMSTrigger}</li>
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
 * "AuthorisationResult10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Outcome of the authorisation, and actions to perform."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AuthorisationResult4
 * AuthorisationResult4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AuthorisationResult10", propOrder = {"authorisationEntity", "responseToAuthorisation", "authorisationCode", "completionRequired", "tMSTrigger"})
public class AuthorisationResult10 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AuthstnNtty")
	protected GenericIdentification90 authorisationEntity;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult10
	 * AuthorisationResult10}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult4#mmAuthorisationEntity
	 * AuthorisationResult4.mmAuthorisationEntity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AuthorisationResult10, Optional<GenericIdentification90>> mmAuthorisationEntity = new MMMessageAssociationEnd<AuthorisationResult10, Optional<GenericIdentification90>>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AuthorisationResult10.mmObject();
			isDerived = false;
			xmlTag = "AuthstnNtty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationEntity";
			definition = "Type of party that has delivered or declined the card payment authorisation (the party is not identified).";
			previousVersion_lazy = () -> AuthorisationResult4.mmAuthorisationEntity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification90.mmObject();
		}

		@Override
		public Optional<GenericIdentification90> getValue(AuthorisationResult10 obj) {
			return obj.getAuthorisationEntity();
		}

		@Override
		public void setValue(AuthorisationResult10 obj, Optional<GenericIdentification90> value) {
			obj.setAuthorisationEntity(value.orElse(null));
		}
	};
	@XmlElement(name = "RspnToAuthstn", required = true)
	protected ResponseType5 responseToAuthorisation;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult10
	 * AuthorisationResult10}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult4#mmResponseToAuthorisation
	 * AuthorisationResult4.mmResponseToAuthorisation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AuthorisationResult10, ResponseType5> mmResponseToAuthorisation = new MMMessageAssociationEnd<AuthorisationResult10, ResponseType5>() {
		{
			businessElementTrace_lazy = () -> CardPaymentValidation.mmResponse;
			componentContext_lazy = () -> com.tools20022.repository.msg.AuthorisationResult10.mmObject();
			isDerived = false;
			xmlTag = "RspnToAuthstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseToAuthorisation";
			definition = "Response to an authorisation request.";
			previousVersion_lazy = () -> AuthorisationResult4.mmResponseToAuthorisation;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ResponseType5.mmObject();
		}

		@Override
		public ResponseType5 getValue(AuthorisationResult10 obj) {
			return obj.getResponseToAuthorisation();
		}

		@Override
		public void setValue(AuthorisationResult10 obj, ResponseType5 value) {
			obj.setResponseToAuthorisation(value);
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
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult10
	 * AuthorisationResult10}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult4#mmAuthorisationCode
	 * AuthorisationResult4.mmAuthorisationCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AuthorisationResult10, Optional<Min6Max8Text>> mmAuthorisationCode = new MMMessageAttribute<AuthorisationResult10, Optional<Min6Max8Text>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentValidation.mmAuthorisationCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.AuthorisationResult10.mmObject();
			isDerived = false;
			xmlTag = "AuthstnCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationCode";
			definition = "Value assigned by the authorising party.";
			previousVersion_lazy = () -> AuthorisationResult4.mmAuthorisationCode;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Min6Max8Text.mmObject();
		}

		@Override
		public Optional<Min6Max8Text> getValue(AuthorisationResult10 obj) {
			return obj.getAuthorisationCode();
		}

		@Override
		public void setValue(AuthorisationResult10 obj, Optional<Min6Max8Text> value) {
			obj.setAuthorisationCode(value.orElse(null));
		}
	};
	@XmlElement(name = "CmpltnReqrd")
	protected TrueFalseIndicator completionRequired;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmCompletionRequired
	 * CardPaymentAcquiring.mmCompletionRequired}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult10
	 * AuthorisationResult10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmpltnReqrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompletionRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the acquirer requires a further exchange completion after the completion of the transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult4#mmCompletionRequired
	 * AuthorisationResult4.mmCompletionRequired}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AuthorisationResult10, Optional<TrueFalseIndicator>> mmCompletionRequired = new MMMessageAttribute<AuthorisationResult10, Optional<TrueFalseIndicator>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmCompletionRequired;
			componentContext_lazy = () -> com.tools20022.repository.msg.AuthorisationResult10.mmObject();
			isDerived = false;
			xmlTag = "CmpltnReqrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompletionRequired";
			definition = "Indicates whether the acquirer requires a further exchange completion after the completion of the transaction.";
			previousVersion_lazy = () -> AuthorisationResult4.mmCompletionRequired;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(AuthorisationResult10 obj) {
			return obj.getCompletionRequired();
		}

		@Override
		public void setValue(AuthorisationResult10 obj, Optional<TrueFalseIndicator> value) {
			obj.setCompletionRequired(value.orElse(null));
		}
	};
	@XmlElement(name = "TMSTrggr")
	protected TMSTrigger1 tMSTrigger;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TMSTrigger1
	 * TMSTrigger1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmTMSTrigger
	 * CardPaymentAcquiring.mmTMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult10
	 * AuthorisationResult10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TMSTrggr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TMSTrigger"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instructs the point of interaction (POI) how to contact the host to initiate the maintenance of the terminal."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult4#mmTMSTrigger
	 * AuthorisationResult4.mmTMSTrigger}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AuthorisationResult10, Optional<TMSTrigger1>> mmTMSTrigger = new MMMessageAssociationEnd<AuthorisationResult10, Optional<TMSTrigger1>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmTMSTrigger;
			componentContext_lazy = () -> com.tools20022.repository.msg.AuthorisationResult10.mmObject();
			isDerived = false;
			xmlTag = "TMSTrggr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMSTrigger";
			definition = "Instructs the point of interaction (POI) how to contact the host to initiate the maintenance of the terminal.";
			previousVersion_lazy = () -> AuthorisationResult4.mmTMSTrigger;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TMSTrigger1.mmObject();
		}

		@Override
		public Optional<TMSTrigger1> getValue(AuthorisationResult10 obj) {
			return obj.getTMSTrigger();
		}

		@Override
		public void setValue(AuthorisationResult10 obj, Optional<TMSTrigger1> value) {
			obj.setTMSTrigger(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AuthorisationResult10.mmAuthorisationEntity, com.tools20022.repository.msg.AuthorisationResult10.mmResponseToAuthorisation,
						com.tools20022.repository.msg.AuthorisationResult10.mmAuthorisationCode, com.tools20022.repository.msg.AuthorisationResult10.mmCompletionRequired, com.tools20022.repository.msg.AuthorisationResult10.mmTMSTrigger);
				trace_lazy = () -> CardPaymentValidation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AuthorisationResult10";
				definition = "Outcome of the authorisation, and actions to perform.";
				previousVersion_lazy = () -> AuthorisationResult4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<GenericIdentification90> getAuthorisationEntity() {
		return authorisationEntity == null ? Optional.empty() : Optional.of(authorisationEntity);
	}

	public AuthorisationResult10 setAuthorisationEntity(GenericIdentification90 authorisationEntity) {
		this.authorisationEntity = authorisationEntity;
		return this;
	}

	public ResponseType5 getResponseToAuthorisation() {
		return responseToAuthorisation;
	}

	public AuthorisationResult10 setResponseToAuthorisation(ResponseType5 responseToAuthorisation) {
		this.responseToAuthorisation = Objects.requireNonNull(responseToAuthorisation);
		return this;
	}

	public Optional<Min6Max8Text> getAuthorisationCode() {
		return authorisationCode == null ? Optional.empty() : Optional.of(authorisationCode);
	}

	public AuthorisationResult10 setAuthorisationCode(Min6Max8Text authorisationCode) {
		this.authorisationCode = authorisationCode;
		return this;
	}

	public Optional<TrueFalseIndicator> getCompletionRequired() {
		return completionRequired == null ? Optional.empty() : Optional.of(completionRequired);
	}

	public AuthorisationResult10 setCompletionRequired(TrueFalseIndicator completionRequired) {
		this.completionRequired = completionRequired;
		return this;
	}

	public Optional<TMSTrigger1> getTMSTrigger() {
		return tMSTrigger == null ? Optional.empty() : Optional.of(tMSTrigger);
	}

	public AuthorisationResult10 setTMSTrigger(TMSTrigger1 tMSTrigger) {
		this.tMSTrigger = tMSTrigger;
		return this;
	}
}