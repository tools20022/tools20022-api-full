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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CardPaymentDataSetTransaction22;
import com.tools20022.repository.msg.CardPaymentDataSetTransaction23;
import com.tools20022.repository.msg.CardPaymentDataSetTransaction24;
import com.tools20022.repository.msg.CardPaymentDataSetTransaction25;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Card payment transaction choice between cancellation, authorisation request
 * and authorisation response.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction6Choice#mmCompletion
 * CardPaymentDataSetTransaction6Choice.mmCompletion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction6Choice#mmCancellation
 * CardPaymentDataSetTransaction6Choice.mmCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction6Choice#mmAuthorisationRequest
 * CardPaymentDataSetTransaction6Choice.mmAuthorisationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction6Choice#mmAuthorisationResponse
 * CardPaymentDataSetTransaction6Choice.mmAuthorisationResponse}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardPaymentDataSetTransaction6Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Card payment transaction choice between cancellation, authorisation request and authorisation response."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction5Choice
 * CardPaymentDataSetTransaction5Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardPaymentDataSetTransaction6Choice", propOrder = {"completion", "cancellation", "authorisationRequest", "authorisationResponse"})
public class CardPaymentDataSetTransaction6Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Cmpltn", required = true)
	protected CardPaymentDataSetTransaction24 completion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction24
	 * CardPaymentDataSetTransaction24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction6Choice
	 * CardPaymentDataSetTransaction6Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cmpltn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Completion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Completed card payment transaction to be captured."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction5Choice#mmCompletion
	 * CardPaymentDataSetTransaction5Choice.mmCompletion}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentDataSetTransaction6Choice, CardPaymentDataSetTransaction24> mmCompletion = new MMMessageAttribute<CardPaymentDataSetTransaction6Choice, CardPaymentDataSetTransaction24>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.CardPaymentDataSetTransaction6Choice.mmObject();
			isDerived = false;
			xmlTag = "Cmpltn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Completion";
			definition = "Completed card payment transaction to be captured.";
			previousVersion_lazy = () -> CardPaymentDataSetTransaction5Choice.mmCompletion;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CardPaymentDataSetTransaction24.mmObject();
		}

		@Override
		public CardPaymentDataSetTransaction24 getValue(CardPaymentDataSetTransaction6Choice obj) {
			return obj.getCompletion();
		}

		@Override
		public void setValue(CardPaymentDataSetTransaction6Choice obj, CardPaymentDataSetTransaction24 value) {
			obj.setCompletion(value);
		}
	};
	@XmlElement(name = "Cxl", required = true)
	protected CardPaymentDataSetTransaction23 cancellation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction23
	 * CardPaymentDataSetTransaction23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction6Choice
	 * CardPaymentDataSetTransaction6Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cxl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cancelled card payment transaction to be captured."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction5Choice#mmCancellation
	 * CardPaymentDataSetTransaction5Choice.mmCancellation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentDataSetTransaction6Choice, CardPaymentDataSetTransaction23> mmCancellation = new MMMessageAttribute<CardPaymentDataSetTransaction6Choice, CardPaymentDataSetTransaction23>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.CardPaymentDataSetTransaction6Choice.mmObject();
			isDerived = false;
			xmlTag = "Cxl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancellation";
			definition = "Cancelled card payment transaction to be captured.";
			previousVersion_lazy = () -> CardPaymentDataSetTransaction5Choice.mmCancellation;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CardPaymentDataSetTransaction23.mmObject();
		}

		@Override
		public CardPaymentDataSetTransaction23 getValue(CardPaymentDataSetTransaction6Choice obj) {
			return obj.getCancellation();
		}

		@Override
		public void setValue(CardPaymentDataSetTransaction6Choice obj, CardPaymentDataSetTransaction23 value) {
			obj.setCancellation(value);
		}
	};
	@XmlElement(name = "AuthstnReq", required = true)
	protected CardPaymentDataSetTransaction22 authorisationRequest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction22
	 * CardPaymentDataSetTransaction22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction6Choice
	 * CardPaymentDataSetTransaction6Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthstnReq"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisationRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card payment transaction including an authorisation request."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction5Choice#mmAuthorisationRequest
	 * CardPaymentDataSetTransaction5Choice.mmAuthorisationRequest}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentDataSetTransaction6Choice, CardPaymentDataSetTransaction22> mmAuthorisationRequest = new MMMessageAttribute<CardPaymentDataSetTransaction6Choice, CardPaymentDataSetTransaction22>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.CardPaymentDataSetTransaction6Choice.mmObject();
			isDerived = false;
			xmlTag = "AuthstnReq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationRequest";
			definition = "Card payment transaction including an authorisation request.";
			previousVersion_lazy = () -> CardPaymentDataSetTransaction5Choice.mmAuthorisationRequest;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CardPaymentDataSetTransaction22.mmObject();
		}

		@Override
		public CardPaymentDataSetTransaction22 getValue(CardPaymentDataSetTransaction6Choice obj) {
			return obj.getAuthorisationRequest();
		}

		@Override
		public void setValue(CardPaymentDataSetTransaction6Choice obj, CardPaymentDataSetTransaction22 value) {
			obj.setAuthorisationRequest(value);
		}
	};
	@XmlElement(name = "AuthstnRspn", required = true)
	protected CardPaymentDataSetTransaction25 authorisationResponse;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction25
	 * CardPaymentDataSetTransaction25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction6Choice
	 * CardPaymentDataSetTransaction6Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthstnRspn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisationResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card payment transaction including an authorisation response."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction5Choice#mmAuthorisationResponse
	 * CardPaymentDataSetTransaction5Choice.mmAuthorisationResponse}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentDataSetTransaction6Choice, CardPaymentDataSetTransaction25> mmAuthorisationResponse = new MMMessageAttribute<CardPaymentDataSetTransaction6Choice, CardPaymentDataSetTransaction25>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.CardPaymentDataSetTransaction6Choice.mmObject();
			isDerived = false;
			xmlTag = "AuthstnRspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationResponse";
			definition = "Card payment transaction including an authorisation response.";
			previousVersion_lazy = () -> CardPaymentDataSetTransaction5Choice.mmAuthorisationResponse;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CardPaymentDataSetTransaction25.mmObject();
		}

		@Override
		public CardPaymentDataSetTransaction25 getValue(CardPaymentDataSetTransaction6Choice obj) {
			return obj.getAuthorisationResponse();
		}

		@Override
		public void setValue(CardPaymentDataSetTransaction6Choice obj, CardPaymentDataSetTransaction25 value) {
			obj.setAuthorisationResponse(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CardPaymentDataSetTransaction6Choice.mmCompletion, com.tools20022.repository.choice.CardPaymentDataSetTransaction6Choice.mmCancellation,
						com.tools20022.repository.choice.CardPaymentDataSetTransaction6Choice.mmAuthorisationRequest, com.tools20022.repository.choice.CardPaymentDataSetTransaction6Choice.mmAuthorisationResponse);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentDataSetTransaction6Choice";
				definition = "Card payment transaction choice between cancellation, authorisation request and authorisation response.";
				previousVersion_lazy = () -> CardPaymentDataSetTransaction5Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public CardPaymentDataSetTransaction24 getCompletion() {
		return completion;
	}

	public CardPaymentDataSetTransaction6Choice setCompletion(CardPaymentDataSetTransaction24 completion) {
		this.completion = Objects.requireNonNull(completion);
		return this;
	}

	public CardPaymentDataSetTransaction23 getCancellation() {
		return cancellation;
	}

	public CardPaymentDataSetTransaction6Choice setCancellation(CardPaymentDataSetTransaction23 cancellation) {
		this.cancellation = Objects.requireNonNull(cancellation);
		return this;
	}

	public CardPaymentDataSetTransaction22 getAuthorisationRequest() {
		return authorisationRequest;
	}

	public CardPaymentDataSetTransaction6Choice setAuthorisationRequest(CardPaymentDataSetTransaction22 authorisationRequest) {
		this.authorisationRequest = Objects.requireNonNull(authorisationRequest);
		return this;
	}

	public CardPaymentDataSetTransaction25 getAuthorisationResponse() {
		return authorisationResponse;
	}

	public CardPaymentDataSetTransaction6Choice setAuthorisationResponse(CardPaymentDataSetTransaction25 authorisationResponse) {
		this.authorisationResponse = Objects.requireNonNull(authorisationResponse);
		return this;
	}
}