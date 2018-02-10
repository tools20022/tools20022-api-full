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
import com.tools20022.repository.msg.CardPaymentDataSetTransaction18;
import com.tools20022.repository.msg.CardPaymentDataSetTransaction19;
import com.tools20022.repository.msg.CardPaymentDataSetTransaction20;
import com.tools20022.repository.msg.CardPaymentDataSetTransaction21;
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
 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction5Choice#mmCompletion
 * CardPaymentDataSetTransaction5Choice.mmCompletion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction5Choice#mmCancellation
 * CardPaymentDataSetTransaction5Choice.mmCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction5Choice#mmAuthorisationRequest
 * CardPaymentDataSetTransaction5Choice.mmAuthorisationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction5Choice#mmAuthorisationResponse
 * CardPaymentDataSetTransaction5Choice.mmAuthorisationResponse}</li>
 * </ul>
 * </li>
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
 * "CardPaymentDataSetTransaction5Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Card payment transaction choice between cancellation, authorisation request and authorisation response."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction4Choice
 * CardPaymentDataSetTransaction4Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardPaymentDataSetTransaction5Choice", propOrder = {"completion", "cancellation", "authorisationRequest", "authorisationResponse"})
public class CardPaymentDataSetTransaction5Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Cmpltn", required = true)
	protected CardPaymentDataSetTransaction18 completion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction18
	 * CardPaymentDataSetTransaction18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction5Choice
	 * CardPaymentDataSetTransaction5Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cmpltn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Completion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Completed card payment transaction to be captured."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction4Choice#mmCompletion
	 * CardPaymentDataSetTransaction4Choice.mmCompletion}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCompletion = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.CardPaymentDataSetTransaction5Choice.mmObject();
			isDerived = false;
			xmlTag = "Cmpltn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Completion";
			definition = "Completed card payment transaction to be captured.";
			previousVersion_lazy = () -> CardPaymentDataSetTransaction4Choice.mmCompletion;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CardPaymentDataSetTransaction18.mmObject();
		}
	};
	@XmlElement(name = "Cxl", required = true)
	protected CardPaymentDataSetTransaction19 cancellation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction19
	 * CardPaymentDataSetTransaction19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction5Choice
	 * CardPaymentDataSetTransaction5Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cxl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cancelled card payment transaction to be captured."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction4Choice#mmCancellation
	 * CardPaymentDataSetTransaction4Choice.mmCancellation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCancellation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.CardPaymentDataSetTransaction5Choice.mmObject();
			isDerived = false;
			xmlTag = "Cxl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancellation";
			definition = "Cancelled card payment transaction to be captured.";
			previousVersion_lazy = () -> CardPaymentDataSetTransaction4Choice.mmCancellation;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CardPaymentDataSetTransaction19.mmObject();
		}
	};
	@XmlElement(name = "AuthstnReq", required = true)
	protected CardPaymentDataSetTransaction20 authorisationRequest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction20
	 * CardPaymentDataSetTransaction20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction5Choice
	 * CardPaymentDataSetTransaction5Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthstnReq"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisationRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card payment transaction including an authorisation request."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction4Choice#mmAuthorisationRequest
	 * CardPaymentDataSetTransaction4Choice.mmAuthorisationRequest}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAuthorisationRequest = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.CardPaymentDataSetTransaction5Choice.mmObject();
			isDerived = false;
			xmlTag = "AuthstnReq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationRequest";
			definition = "Card payment transaction including an authorisation request.";
			previousVersion_lazy = () -> CardPaymentDataSetTransaction4Choice.mmAuthorisationRequest;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CardPaymentDataSetTransaction20.mmObject();
		}
	};
	@XmlElement(name = "AuthstnRspn", required = true)
	protected CardPaymentDataSetTransaction21 authorisationResponse;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction21
	 * CardPaymentDataSetTransaction21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction5Choice
	 * CardPaymentDataSetTransaction5Choice}</li>
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
	 * definition} =
	 * "Card payment transaction including an authorisation response."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction4Choice#mmAuthorisationResponse
	 * CardPaymentDataSetTransaction4Choice.mmAuthorisationResponse}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAuthorisationResponse = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.CardPaymentDataSetTransaction5Choice.mmObject();
			isDerived = false;
			xmlTag = "AuthstnRspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationResponse";
			definition = "Card payment transaction including an authorisation response.";
			previousVersion_lazy = () -> CardPaymentDataSetTransaction4Choice.mmAuthorisationResponse;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CardPaymentDataSetTransaction21.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CardPaymentDataSetTransaction5Choice.mmCompletion, com.tools20022.repository.choice.CardPaymentDataSetTransaction5Choice.mmCancellation,
						com.tools20022.repository.choice.CardPaymentDataSetTransaction5Choice.mmAuthorisationRequest, com.tools20022.repository.choice.CardPaymentDataSetTransaction5Choice.mmAuthorisationResponse);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentDataSetTransaction5Choice";
				definition = "Card payment transaction choice between cancellation, authorisation request and authorisation response.";
				previousVersion_lazy = () -> CardPaymentDataSetTransaction4Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public CardPaymentDataSetTransaction18 getCompletion() {
		return completion;
	}

	public CardPaymentDataSetTransaction5Choice setCompletion(CardPaymentDataSetTransaction18 completion) {
		this.completion = Objects.requireNonNull(completion);
		return this;
	}

	public CardPaymentDataSetTransaction19 getCancellation() {
		return cancellation;
	}

	public CardPaymentDataSetTransaction5Choice setCancellation(CardPaymentDataSetTransaction19 cancellation) {
		this.cancellation = Objects.requireNonNull(cancellation);
		return this;
	}

	public CardPaymentDataSetTransaction20 getAuthorisationRequest() {
		return authorisationRequest;
	}

	public CardPaymentDataSetTransaction5Choice setAuthorisationRequest(CardPaymentDataSetTransaction20 authorisationRequest) {
		this.authorisationRequest = Objects.requireNonNull(authorisationRequest);
		return this;
	}

	public CardPaymentDataSetTransaction21 getAuthorisationResponse() {
		return authorisationResponse;
	}

	public CardPaymentDataSetTransaction5Choice setAuthorisationResponse(CardPaymentDataSetTransaction21 authorisationResponse) {
		this.authorisationResponse = Objects.requireNonNull(authorisationResponse);
		return this;
	}
}