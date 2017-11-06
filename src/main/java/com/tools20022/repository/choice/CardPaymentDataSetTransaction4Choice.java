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
import com.tools20022.repository.msg.CardPaymentDataSetTransaction14;
import com.tools20022.repository.msg.CardPaymentDataSetTransaction15;
import com.tools20022.repository.msg.CardPaymentDataSetTransaction16;
import com.tools20022.repository.msg.CardPaymentDataSetTransaction17;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction4Choice#mmCompletion
 * CardPaymentDataSetTransaction4Choice.mmCompletion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction4Choice#mmCancellation
 * CardPaymentDataSetTransaction4Choice.mmCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction4Choice#mmAuthorisationRequest
 * CardPaymentDataSetTransaction4Choice.mmAuthorisationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction4Choice#mmAuthorisationResponse
 * CardPaymentDataSetTransaction4Choice.mmAuthorisationResponse}</li>
 * </ul>
 * </li>
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
 * "CardPaymentDataSetTransaction4Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Card payment transaction choice between cancellation, authorisation request and authorisation response."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction5Choice
 * CardPaymentDataSetTransaction5Choice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction3Choice
 * CardPaymentDataSetTransaction3Choice}</li>
 * </ul>
 */
public class CardPaymentDataSetTransaction4Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected CardPaymentDataSetTransaction14 completion;
	/**
	 * Completed card payment transaction to be captured.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction14
	 * CardPaymentDataSetTransaction14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction4Choice
	 * CardPaymentDataSetTransaction4Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction5Choice#mmCompletion
	 * CardPaymentDataSetTransaction5Choice.mmCompletion}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction3Choice#mmCompletion
	 * CardPaymentDataSetTransaction3Choice.mmCompletion}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCompletion = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentDataSetTransaction4Choice.mmObject();
			isDerived = false;
			xmlTag = "Cmpltn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Completion";
			definition = "Completed card payment transaction to be captured.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CardPaymentDataSetTransaction5Choice.mmCompletion);
			previousVersion_lazy = () -> com.tools20022.repository.choice.CardPaymentDataSetTransaction3Choice.mmCompletion;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CardPaymentDataSetTransaction14.mmObject();
		}
	};
	protected CardPaymentDataSetTransaction15 cancellation;
	/**
	 * Cancelled card payment transaction to be captured.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction15
	 * CardPaymentDataSetTransaction15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction4Choice
	 * CardPaymentDataSetTransaction4Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction5Choice#mmCancellation
	 * CardPaymentDataSetTransaction5Choice.mmCancellation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction3Choice#mmCancellation
	 * CardPaymentDataSetTransaction3Choice.mmCancellation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCancellation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentDataSetTransaction4Choice.mmObject();
			isDerived = false;
			xmlTag = "Cxl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancellation";
			definition = "Cancelled card payment transaction to be captured.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CardPaymentDataSetTransaction5Choice.mmCancellation);
			previousVersion_lazy = () -> com.tools20022.repository.choice.CardPaymentDataSetTransaction3Choice.mmCancellation;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CardPaymentDataSetTransaction15.mmObject();
		}
	};
	protected CardPaymentDataSetTransaction16 authorisationRequest;
	/**
	 * Card payment transaction including an authorisation request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction16
	 * CardPaymentDataSetTransaction16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction4Choice
	 * CardPaymentDataSetTransaction4Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction5Choice#mmAuthorisationRequest
	 * CardPaymentDataSetTransaction5Choice.mmAuthorisationRequest}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction3Choice#mmAuthorisationRequest
	 * CardPaymentDataSetTransaction3Choice.mmAuthorisationRequest}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAuthorisationRequest = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentDataSetTransaction4Choice.mmObject();
			isDerived = false;
			xmlTag = "AuthstnReq";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationRequest";
			definition = "Card payment transaction including an authorisation request.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CardPaymentDataSetTransaction5Choice.mmAuthorisationRequest);
			previousVersion_lazy = () -> com.tools20022.repository.choice.CardPaymentDataSetTransaction3Choice.mmAuthorisationRequest;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CardPaymentDataSetTransaction16.mmObject();
		}
	};
	protected CardPaymentDataSetTransaction17 authorisationResponse;
	/**
	 * Card payment transaction including an authorisation response.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction17
	 * CardPaymentDataSetTransaction17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction4Choice
	 * CardPaymentDataSetTransaction4Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction5Choice#mmAuthorisationResponse
	 * CardPaymentDataSetTransaction5Choice.mmAuthorisationResponse}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction3Choice#mmAuthorisationResponse
	 * CardPaymentDataSetTransaction3Choice.mmAuthorisationResponse}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAuthorisationResponse = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentDataSetTransaction4Choice.mmObject();
			isDerived = false;
			xmlTag = "AuthstnRspn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationResponse";
			definition = "Card payment transaction including an authorisation response.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CardPaymentDataSetTransaction5Choice.mmAuthorisationResponse);
			previousVersion_lazy = () -> com.tools20022.repository.choice.CardPaymentDataSetTransaction3Choice.mmAuthorisationResponse;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CardPaymentDataSetTransaction17.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CardPaymentDataSetTransaction4Choice.mmCompletion, com.tools20022.repository.choice.CardPaymentDataSetTransaction4Choice.mmCancellation,
						com.tools20022.repository.choice.CardPaymentDataSetTransaction4Choice.mmAuthorisationRequest, com.tools20022.repository.choice.CardPaymentDataSetTransaction4Choice.mmAuthorisationResponse);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CardPaymentDataSetTransaction4Choice";
				definition = "Card payment transaction choice between cancellation, authorisation request and authorisation response.";
				nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSetTransaction5Choice.mmObject());
				previousVersion_lazy = () -> CardPaymentDataSetTransaction3Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public CardPaymentDataSetTransaction14 getCompletion() {
		return completion;
	}

	public void setCompletion(CardPaymentDataSetTransaction14 completion) {
		this.completion = completion;
	}

	public CardPaymentDataSetTransaction15 getCancellation() {
		return cancellation;
	}

	public void setCancellation(CardPaymentDataSetTransaction15 cancellation) {
		this.cancellation = cancellation;
	}

	public CardPaymentDataSetTransaction16 getAuthorisationRequest() {
		return authorisationRequest;
	}

	public void setAuthorisationRequest(CardPaymentDataSetTransaction16 authorisationRequest) {
		this.authorisationRequest = authorisationRequest;
	}

	public CardPaymentDataSetTransaction17 getAuthorisationResponse() {
		return authorisationResponse;
	}

	public void setAuthorisationResponse(CardPaymentDataSetTransaction17 authorisationResponse) {
		this.authorisationResponse = authorisationResponse;
	}
}