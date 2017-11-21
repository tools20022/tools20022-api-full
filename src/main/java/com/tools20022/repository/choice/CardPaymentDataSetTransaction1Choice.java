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
import com.tools20022.repository.msg.CardPaymentDataSetTransaction2;
import com.tools20022.repository.msg.CardPaymentDataSetTransaction3;
import com.tools20022.repository.msg.CardPaymentDataSetTransaction4;
import com.tools20022.repository.msg.CardPaymentDataSetTransaction5;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction1Choice#mmCompletion
 * CardPaymentDataSetTransaction1Choice.mmCompletion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction1Choice#mmCancellation
 * CardPaymentDataSetTransaction1Choice.mmCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction1Choice#mmAuthorisationRequest
 * CardPaymentDataSetTransaction1Choice.mmAuthorisationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction1Choice#mmAuthorisationResponse
 * CardPaymentDataSetTransaction1Choice.mmAuthorisationResponse}</li>
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
 * "CardPaymentDataSetTransaction1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Card payment transaction choice between cancellation, authorisation request and authorisation response."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction2Choice
 * CardPaymentDataSetTransaction2Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CardPaymentDataSetTransaction1Choice", propOrder = {"completion", "cancellation", "authorisationRequest", "authorisationResponse"})
public class CardPaymentDataSetTransaction1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected CardPaymentDataSetTransaction2 completion;
	/**
	 * Completed card payment transaction to be captured.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction2
	 * CardPaymentDataSetTransaction2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction1Choice
	 * CardPaymentDataSetTransaction1Choice}</li>
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
	 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction2Choice#mmCompletion
	 * CardPaymentDataSetTransaction2Choice.mmCompletion}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCompletion = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentDataSetTransaction1Choice.mmObject();
			isDerived = false;
			xmlTag = "Cmpltn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Completion";
			definition = "Completed card payment transaction to be captured.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSetTransaction2Choice.mmCompletion);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CardPaymentDataSetTransaction2.mmObject();
		}
	};
	protected CardPaymentDataSetTransaction3 cancellation;
	/**
	 * Cancelled card payment transaction to be captured.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction3
	 * CardPaymentDataSetTransaction3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction1Choice
	 * CardPaymentDataSetTransaction1Choice}</li>
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
	 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction2Choice#mmCancellation
	 * CardPaymentDataSetTransaction2Choice.mmCancellation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCancellation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentDataSetTransaction1Choice.mmObject();
			isDerived = false;
			xmlTag = "Cxl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancellation";
			definition = "Cancelled card payment transaction to be captured.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSetTransaction2Choice.mmCancellation);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CardPaymentDataSetTransaction3.mmObject();
		}
	};
	protected CardPaymentDataSetTransaction4 authorisationRequest;
	/**
	 * Card payment transaction including an authorisation request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction4
	 * CardPaymentDataSetTransaction4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction1Choice
	 * CardPaymentDataSetTransaction1Choice}</li>
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
	 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction2Choice#mmAuthorisationRequest
	 * CardPaymentDataSetTransaction2Choice.mmAuthorisationRequest}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAuthorisationRequest = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentDataSetTransaction1Choice.mmObject();
			isDerived = false;
			xmlTag = "AuthstnReq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationRequest";
			definition = "Card payment transaction including an authorisation request.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSetTransaction2Choice.mmAuthorisationRequest);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CardPaymentDataSetTransaction4.mmObject();
		}
	};
	protected CardPaymentDataSetTransaction5 authorisationResponse;
	/**
	 * Card payment transaction including an authorisation response.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction5
	 * CardPaymentDataSetTransaction5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction1Choice
	 * CardPaymentDataSetTransaction1Choice}</li>
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
	 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction2Choice#mmAuthorisationResponse
	 * CardPaymentDataSetTransaction2Choice.mmAuthorisationResponse}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAuthorisationResponse = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentDataSetTransaction1Choice.mmObject();
			isDerived = false;
			xmlTag = "AuthstnRspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationResponse";
			definition = "Card payment transaction including an authorisation response.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSetTransaction2Choice.mmAuthorisationResponse);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CardPaymentDataSetTransaction5.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CardPaymentDataSetTransaction1Choice.mmCompletion, CardPaymentDataSetTransaction1Choice.mmCancellation, CardPaymentDataSetTransaction1Choice.mmAuthorisationRequest,
						CardPaymentDataSetTransaction1Choice.mmAuthorisationResponse);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentDataSetTransaction1Choice";
				definition = "Card payment transaction choice between cancellation, authorisation request and authorisation response.";
				nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSetTransaction2Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Cmpltn")
	public CardPaymentDataSetTransaction2 getCompletion() {
		return completion;
	}

	public void setCompletion(CardPaymentDataSetTransaction2 completion) {
		this.completion = completion;
	}

	@XmlElement(name = "Cxl")
	public CardPaymentDataSetTransaction3 getCancellation() {
		return cancellation;
	}

	public void setCancellation(CardPaymentDataSetTransaction3 cancellation) {
		this.cancellation = cancellation;
	}

	@XmlElement(name = "AuthstnReq")
	public CardPaymentDataSetTransaction4 getAuthorisationRequest() {
		return authorisationRequest;
	}

	public void setAuthorisationRequest(CardPaymentDataSetTransaction4 authorisationRequest) {
		this.authorisationRequest = authorisationRequest;
	}

	@XmlElement(name = "AuthstnRspn")
	public CardPaymentDataSetTransaction5 getAuthorisationResponse() {
		return authorisationResponse;
	}

	public void setAuthorisationResponse(CardPaymentDataSetTransaction5 authorisationResponse) {
		this.authorisationResponse = authorisationResponse;
	}
}