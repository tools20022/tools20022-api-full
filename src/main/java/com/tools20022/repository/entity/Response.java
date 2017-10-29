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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.ResponseCode;
import com.tools20022.repository.datatype.Max35Text;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Response#ResponseReason
 * Response.ResponseReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Response#RelatedCardPaymentValidation
 * Response.RelatedCardPaymentValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Response#ResponseToAuthorisation
 * Response.ResponseToAuthorisation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#Response
 * CardPaymentValidation.Response}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ResponseType2#Result
 * ResponseType2.Result}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ResponseType4#Response
 * ResponseType4.Response}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ResponseType8#Response
 * ResponseType8.Response}</li>
 * </ul>
 * </li>
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
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	/**
	 * Detailed result of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ResponseType1#ResponseReason
	 * ResponseType1.ResponseReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ResponseType2#ResultDetails
	 * ResponseType2.ResultDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction4#ResponseReason
	 * ATMTransaction4.ResponseReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ResponseType4#ResponseReason
	 * ResponseType4.ResponseReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ResponseType5#ResponseReason
	 * ResponseType5.ResponseReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ResponseType6#ResponseDetail
	 * ResponseType6.ResponseDetail}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ResponseType8#ResponseReason
	 * ResponseType8.ResponseReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction18#ResponseReason
	 * ATMTransaction18.ResponseReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Response
	 * Response}</li>
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
	public static final MMBusinessAttribute ResponseReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ResponseType1.ResponseReason, com.tools20022.repository.msg.ResponseType2.ResultDetails, com.tools20022.repository.msg.ATMTransaction4.ResponseReason,
					com.tools20022.repository.msg.ResponseType4.ResponseReason, com.tools20022.repository.msg.ResponseType5.ResponseReason, com.tools20022.repository.msg.ResponseType6.ResponseDetail,
					com.tools20022.repository.msg.ResponseType8.ResponseReason, com.tools20022.repository.msg.ATMTransaction18.ResponseReason);
			elementContext_lazy = () -> Response.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ResponseReason";
			definition = "Detailed result of the transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Validation process to which a response is given.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#Response
	 * CardPaymentValidation.Response}</li>
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
	public static final MMBusinessAssociationEnd RelatedCardPaymentValidation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Response.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCardPaymentValidation";
			definition = "Validation process to which a response is given.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CardPaymentValidation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.Response;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Response from the issuer to the authorisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.ResponseCode
	 * ResponseCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionResult1#ResponseToAuthorisation
	 * CardPaymentTransactionResult1.ResponseToAuthorisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse1#Response
	 * CardPaymentTransactionAdviceResponse1.Response}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse3#Response
	 * CardPaymentTransactionAdviceResponse3.Response}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse4#Response
	 * CardPaymentTransactionAdviceResponse4.Response}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse5#Response
	 * CardPaymentTransactionAdviceResponse5.Response}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionResult2#ResponseToAuthorisation
	 * CardPaymentTransactionResult2.ResponseToAuthorisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse6#Response
	 * CardPaymentTransactionAdviceResponse6.Response}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionResult3#ResponseToAuthorisation
	 * CardPaymentTransactionResult3.ResponseToAuthorisation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Response
	 * Response}</li>
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
	public static final MMBusinessAttribute ResponseToAuthorisation = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransactionResult1.ResponseToAuthorisation, com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse1.Response,
					com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse3.Response, com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse4.Response,
					com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse5.Response, com.tools20022.repository.msg.CardPaymentTransactionResult2.ResponseToAuthorisation,
					com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse6.Response, com.tools20022.repository.msg.CardPaymentTransactionResult3.ResponseToAuthorisation);
			elementContext_lazy = () -> Response.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ResponseToAuthorisation";
			definition = "Response from the issuer to the authorisation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ResponseCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Response";
				definition = "Response of a requested service.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardPaymentValidation.Response);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ResponseType2.Result, com.tools20022.repository.msg.ResponseType4.Response, com.tools20022.repository.msg.ResponseType8.Response);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Response.ResponseReason, com.tools20022.repository.entity.Response.RelatedCardPaymentValidation,
						com.tools20022.repository.entity.Response.ResponseToAuthorisation);
				derivationComponent_lazy = () -> Arrays.asList(ResponseType1.mmObject(), CardPaymentTransactionAdviceResponse2.mmObject(), CardPaymentTransactionAdviceResponse1.mmObject(), CardPaymentTransactionAdviceResponse3.mmObject(),
						CardPaymentTransactionAdviceResponse4.mmObject(), CardPaymentTransactionAdviceResponse5.mmObject(), ResponseType2.mmObject(), ResponseType3.mmObject(), ResponseType4.mmObject(),
						CardPaymentTransactionAdviceResponse6.mmObject(), ResponseType5.mmObject(), ResponseType6.mmObject(), ResponseType7.mmObject(), ResponseType8.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}