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
import com.tools20022.repository.codeset.PartyType13Code;
import com.tools20022.repository.datatype.Min6Max8Text;
import com.tools20022.repository.entity.CardPaymentValidation;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.msg.AuthorisationResult9#mmAuthorisationEntity
 * AuthorisationResult9.mmAuthorisationEntity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AuthorisationResult9#mmAuthorisationResponse
 * AuthorisationResult9.mmAuthorisationResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AuthorisationResult9#mmResponseTrace
 * AuthorisationResult9.mmResponseTrace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AuthorisationResult9#mmAuthorisationCode
 * AuthorisationResult9.mmAuthorisationCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AuthorisationResult9#mmAction
 * AuthorisationResult9.mmAction}</li>
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
 * "AuthorisationResult9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Outcome of the withdrawal authorisation."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AuthorisationResult8
 * AuthorisationResult8}</li>
 * </ul>
 */
public class AuthorisationResult9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PartyType13Code authorisationEntity;
	/**
	 * Type of party that has delivered or declined the card payment
	 * authorisation (the party is not identified).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType13Code
	 * PartyType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult9
	 * AuthorisationResult9}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult8#mmAuthorisationEntity
	 * AuthorisationResult8.mmAuthorisationEntity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAuthorisationEntity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> AuthorisationResult9.mmObject();
			isDerived = false;
			xmlTag = "AuthstnNtty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationEntity";
			definition = "Type of party that has delivered or declined the card payment authorisation (the party is not identified).";
			previousVersion_lazy = () -> AuthorisationResult8.mmAuthorisationEntity;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PartyType13Code.mmObject();
		}
	};
	protected ResponseType3 authorisationResponse;
	/**
	 * Result of the authorisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ResponseType3
	 * ResponseType3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmResponse
	 * CardPaymentValidation.mmResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult9
	 * AuthorisationResult9}</li>
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
	public static final MMMessageAssociationEnd mmAuthorisationResponse = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CardPaymentValidation.mmResponse;
			componentContext_lazy = () -> AuthorisationResult9.mmObject();
			isDerived = false;
			xmlTag = "AuthstnRspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationResponse";
			definition = "Result of the authorisation.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ResponseType3.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ResponseType4> responseTrace;
	/**
	 * Trace of response by the entities in the path from the issuer to the ATM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ResponseType4
	 * ResponseType4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmResponse
	 * CardPaymentValidation.mmResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult9
	 * AuthorisationResult9}</li>
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
	public static final MMMessageAssociationEnd mmResponseTrace = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CardPaymentValidation.mmResponse;
			componentContext_lazy = () -> AuthorisationResult9.mmObject();
			isDerived = false;
			xmlTag = "RspnTrac";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseTrace";
			definition = "Trace of response by the entities in the path from the issuer to the ATM.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ResponseType4.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult9
	 * AuthorisationResult9}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult8#mmAuthorisationCode
	 * AuthorisationResult8.mmAuthorisationCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAuthorisationCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPaymentValidation.mmAuthorisationCode;
			componentContext_lazy = () -> AuthorisationResult9.mmObject();
			isDerived = false;
			xmlTag = "AuthstnCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationCode";
			definition = "Value assigned by the authorising party.";
			previousVersion_lazy = () -> AuthorisationResult8.mmAuthorisationCode;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Min6Max8Text.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Action5> action;
	/**
	 * Sequence of actions to be performed by the ATM to complete the
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Action5 Action5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmCardPayment
	 * CardPaymentValidation.mmCardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult9
	 * AuthorisationResult9}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult8#mmAction
	 * AuthorisationResult8.mmAction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAction = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CardPaymentValidation.mmCardPayment;
			componentContext_lazy = () -> AuthorisationResult9.mmObject();
			isDerived = false;
			xmlTag = "Actn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Action";
			definition = "Sequence of actions to be performed by the ATM to complete the transaction.";
			previousVersion_lazy = () -> AuthorisationResult8.mmAction;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Action5.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AuthorisationResult9.mmAuthorisationEntity, AuthorisationResult9.mmAuthorisationResponse, AuthorisationResult9.mmResponseTrace, AuthorisationResult9.mmAuthorisationCode,
						AuthorisationResult9.mmAction);
				trace_lazy = () -> CardPaymentValidation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AuthorisationResult9";
				definition = "Outcome of the withdrawal authorisation.";
				previousVersion_lazy = () -> AuthorisationResult8.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public PartyType13Code getAuthorisationEntity() {
		return authorisationEntity;
	}

	public void setAuthorisationEntity(PartyType13Code authorisationEntity) {
		this.authorisationEntity = authorisationEntity;
	}

	public ResponseType3 getAuthorisationResponse() {
		return authorisationResponse;
	}

	public void setAuthorisationResponse(com.tools20022.repository.msg.ResponseType3 authorisationResponse) {
		this.authorisationResponse = authorisationResponse;
	}

	public List<ResponseType4> getResponseTrace() {
		return responseTrace;
	}

	public void setResponseTrace(List<com.tools20022.repository.msg.ResponseType4> responseTrace) {
		this.responseTrace = responseTrace;
	}

	public Min6Max8Text getAuthorisationCode() {
		return authorisationCode;
	}

	public void setAuthorisationCode(Min6Max8Text authorisationCode) {
		this.authorisationCode = authorisationCode;
	}

	public List<Action5> getAction() {
		return action;
	}

	public void setAction(List<com.tools20022.repository.msg.Action5> action) {
		this.action = action;
	}
}