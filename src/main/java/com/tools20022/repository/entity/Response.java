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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.ResponseCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Response of a requested service.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Response" src="doc-files/Response.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ResponseType1 ResponseType1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse2
 * CardPaymentTransactionAdviceResponse2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse1
 * CardPaymentTransactionAdviceResponse1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse3
 * CardPaymentTransactionAdviceResponse3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse4
 * CardPaymentTransactionAdviceResponse4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse5
 * CardPaymentTransactionAdviceResponse5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ResponseType2 ResponseType2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ResponseType3 ResponseType3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ResponseType4 ResponseType4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse6
 * CardPaymentTransactionAdviceResponse6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ResponseType5 ResponseType5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ResponseType6 ResponseType6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ResponseType7 ResponseType7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ResponseType8 ResponseType8}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmResponse
 * CardPaymentValidation.mmResponse}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ResponseType2#mmResult
 * ResponseType2.mmResult}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ResponseType4#mmResponse
 * ResponseType4.mmResponse}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ResponseType8#mmResponse
 * ResponseType8.mmResponse}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Response#mmResponseReason
 * Response.mmResponseReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Response#mmRelatedCardPaymentValidation
 * Response.mmRelatedCardPaymentValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Response#mmResponseToAuthorisation
 * Response.mmResponseToAuthorisation}</li>
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
 * "Response"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Response of a requested service."</li>
 * </ul>
 */
public class Response {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text responseReason;
	/**
	 * Detailed result of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Response
	 * Response}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ResponseType1#mmResponseReason
	 * ResponseType1.mmResponseReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ResponseType2#mmResultDetails
	 * ResponseType2.mmResultDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction4#mmResponseReason
	 * ATMTransaction4.mmResponseReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ResponseType4#mmResponseReason
	 * ResponseType4.mmResponseReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ResponseType5#mmResponseReason
	 * ResponseType5.mmResponseReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ResponseType6#mmResponseDetail
	 * ResponseType6.mmResponseDetail}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ResponseType8#mmResponseReason
	 * ResponseType8.mmResponseReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction18#mmResponseReason
	 * ATMTransaction18.mmResponseReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponseReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Detailed result of the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmResponseReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ResponseType1.mmResponseReason, ResponseType2.mmResultDetails, ATMTransaction4.mmResponseReason, ResponseType4.mmResponseReason, ResponseType5.mmResponseReason,
					ResponseType6.mmResponseDetail, ResponseType8.mmResponseReason, ATMTransaction18.mmResponseReason);
			elementContext_lazy = () -> Response.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ResponseReason";
			definition = "Detailed result of the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected CardPaymentValidation relatedCardPaymentValidation;
	/**
	 * Validation process to which a response is given.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmResponse
	 * CardPaymentValidation.mmResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation
	 * CardPaymentValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Response
	 * Response}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCardPaymentValidation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Validation process to which a response is given."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedCardPaymentValidation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Response.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCardPaymentValidation";
			definition = "Validation process to which a response is given.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.mmResponse;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.mmObject();
		}
	};
	protected ResponseCode responseToAuthorisation;
	/**
	 * Response from the issuer to the authorisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.ResponseCode
	 * ResponseCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Response
	 * Response}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionResult1#mmResponseToAuthorisation
	 * CardPaymentTransactionResult1.mmResponseToAuthorisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse1#mmResponse
	 * CardPaymentTransactionAdviceResponse1.mmResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse3#mmResponse
	 * CardPaymentTransactionAdviceResponse3.mmResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse4#mmResponse
	 * CardPaymentTransactionAdviceResponse4.mmResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse5#mmResponse
	 * CardPaymentTransactionAdviceResponse5.mmResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionResult2#mmResponseToAuthorisation
	 * CardPaymentTransactionResult2.mmResponseToAuthorisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse6#mmResponse
	 * CardPaymentTransactionAdviceResponse6.mmResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionResult3#mmResponseToAuthorisation
	 * CardPaymentTransactionResult3.mmResponseToAuthorisation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponseToAuthorisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Response from the issuer to the authorisation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmResponseToAuthorisation = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CardPaymentTransactionResult1.mmResponseToAuthorisation, CardPaymentTransactionAdviceResponse1.mmResponse, CardPaymentTransactionAdviceResponse3.mmResponse,
					CardPaymentTransactionAdviceResponse4.mmResponse, CardPaymentTransactionAdviceResponse5.mmResponse, CardPaymentTransactionResult2.mmResponseToAuthorisation, CardPaymentTransactionAdviceResponse6.mmResponse,
					CardPaymentTransactionResult3.mmResponseToAuthorisation);
			elementContext_lazy = () -> Response.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ResponseToAuthorisation";
			definition = "Response from the issuer to the authorisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ResponseCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Response";
				definition = "Response of a requested service.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardPaymentValidation.mmResponse);
				derivationElement_lazy = () -> Arrays.asList(ResponseType2.mmResult, ResponseType4.mmResponse, ResponseType8.mmResponse);
				element_lazy = () -> Arrays.asList(Response.mmResponseReason, Response.mmRelatedCardPaymentValidation, Response.mmResponseToAuthorisation);
				derivationComponent_lazy = () -> Arrays.asList(ResponseType1.mmObject(), CardPaymentTransactionAdviceResponse2.mmObject(), CardPaymentTransactionAdviceResponse1.mmObject(), CardPaymentTransactionAdviceResponse3.mmObject(),
						CardPaymentTransactionAdviceResponse4.mmObject(), CardPaymentTransactionAdviceResponse5.mmObject(), ResponseType2.mmObject(), ResponseType3.mmObject(), ResponseType4.mmObject(),
						CardPaymentTransactionAdviceResponse6.mmObject(), ResponseType5.mmObject(), ResponseType6.mmObject(), ResponseType7.mmObject(), ResponseType8.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getResponseReason() {
		return responseReason;
	}

	public void setResponseReason(Max35Text responseReason) {
		this.responseReason = responseReason;
	}

	public CardPaymentValidation getRelatedCardPaymentValidation() {
		return relatedCardPaymentValidation;
	}

	public void setRelatedCardPaymentValidation(com.tools20022.repository.entity.CardPaymentValidation relatedCardPaymentValidation) {
		this.relatedCardPaymentValidation = relatedCardPaymentValidation;
	}

	public ResponseCode getResponseToAuthorisation() {
		return responseToAuthorisation;
	}

	public void setResponseToAuthorisation(ResponseCode responseToAuthorisation) {
		this.responseToAuthorisation = responseToAuthorisation;
	}
}