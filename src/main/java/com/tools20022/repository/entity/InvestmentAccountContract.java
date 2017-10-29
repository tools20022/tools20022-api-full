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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.AccountContract;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Contract defining the related investment account.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InvestmentAccountContract"
 * src="doc-files/InvestmentAccountContract.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract#LetterIntentReference
 * InvestmentAccountContract.LetterIntentReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract#AccumulationRightReference
 * InvestmentAccountContract.AccumulationRightReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract#InvestmentAccount
 * InvestmentAccountContract.InvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract#Services
 * InvestmentAccountContract.Services}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract#ModeledAccount
 * InvestmentAccountContract.ModeledAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#InvestmentAccountContract
 * InvestmentAccount.InvestmentAccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#InvestmentAccountContract
 * InvestmentAccountService.InvestmentAccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ManagedAccountProduct#InvestmentAccountContract
 * ManagedAccountProduct.InvestmentAccountContract}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.AccountContract
 * AccountContract}</li>
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
 * "InvestmentAccountContract"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Contract defining the related investment account."</li>
 * </ul>
 */
public class InvestmentAccountContract extends AccountContract {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Reference of a letter of intent program, in which sales commissions are
	 * reduced based on the aggregate of a customer's actual purchase and
	 * anticipated purchases, over a specific period of time, and as agreed by
	 * the customer. A letter of intent program is mainly used in the US market.
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount17#LetterIntentReference
	 * InvestmentAccount17.LetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount27#LetterIntentReference
	 * InvestmentAccount27.LetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#LetterIntentDetails
	 * InvestmentAccount35.LetterIntentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#LetterIntentReference
	 * InvestmentAccount18.LetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount28#LetterIntentReference
	 * InvestmentAccount28.LetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount36#LetterIntentDetails
	 * InvestmentAccount36.LetterIntentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount16#LetterIntentReference
	 * InvestmentAccount16.LetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount26#LetterIntentReference
	 * InvestmentAccount26.LetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount34#LetterIntentDetails
	 * InvestmentAccount34.LetterIntentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#LetterIntentDetails
	 * InvestmentAccount38.LetterIntentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount37#LetterIntentDetails
	 * InvestmentAccount37.LetterIntentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount39#LetterIntentDetails
	 * InvestmentAccount39.LetterIntentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#LetterIntentDetails
	 * InvestmentAccount46.LetterIntentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount47#LetterIntentDetails
	 * InvestmentAccount47.LetterIntentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#LetterIntentDetails
	 * InvestmentAccount49.LetterIntentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51#LetterIntentDetails
	 * InvestmentAccount51.LetterIntentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#LetterIntentDetails
	 * InvestmentAccount50.LetterIntentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#LetterIntentDetails
	 * InvestmentAccount61.LetterIntentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#LetterIntentDetails
	 * InvestmentAccount63.LetterIntentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#LetterIntentDetails
	 * InvestmentAccount62.LetterIntentDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract
	 * InvestmentAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterIntentReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference of a letter of intent program, in which sales commissions are reduced based on the aggregate of a customer's actual purchase and anticipated purchases, over a specific period of time, and as agreed by the customer. A letter of intent program is mainly used in the US market."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute LetterIntentReference = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount17.LetterIntentReference, com.tools20022.repository.msg.InvestmentAccount27.LetterIntentReference,
					com.tools20022.repository.msg.InvestmentAccount35.LetterIntentDetails, com.tools20022.repository.msg.InvestmentAccount18.LetterIntentReference, com.tools20022.repository.msg.InvestmentAccount28.LetterIntentReference,
					com.tools20022.repository.msg.InvestmentAccount36.LetterIntentDetails, com.tools20022.repository.msg.InvestmentAccount16.LetterIntentReference, com.tools20022.repository.msg.InvestmentAccount26.LetterIntentReference,
					com.tools20022.repository.msg.InvestmentAccount34.LetterIntentDetails, com.tools20022.repository.msg.InvestmentAccount38.LetterIntentDetails, com.tools20022.repository.msg.InvestmentAccount37.LetterIntentDetails,
					com.tools20022.repository.msg.InvestmentAccount39.LetterIntentDetails, com.tools20022.repository.msg.InvestmentAccount46.LetterIntentDetails, com.tools20022.repository.msg.InvestmentAccount47.LetterIntentDetails,
					com.tools20022.repository.msg.InvestmentAccount49.LetterIntentDetails, com.tools20022.repository.msg.InvestmentAccount51.LetterIntentDetails, com.tools20022.repository.msg.InvestmentAccount50.LetterIntentDetails,
					com.tools20022.repository.msg.InvestmentAccount61.LetterIntentDetails, com.tools20022.repository.msg.InvestmentAccount63.LetterIntentDetails, com.tools20022.repository.msg.InvestmentAccount62.LetterIntentDetails);
			elementContext_lazy = () -> InvestmentAccountContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LetterIntentReference";
			definition = "Reference of a letter of intent program, in which sales commissions are reduced based on the aggregate of a customer's actual purchase and anticipated purchases, over a specific period of time, and as agreed by the customer. A letter of intent program is mainly used in the US market.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Reference of an accumulation rights program, in which sales commissions
	 * are based on a customer's present purchases of shares and the aggregate
	 * quantity previously purchased by the customer. An accumulation rights
	 * program is mainly used in the US market.
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount17#AccumulationRightReference
	 * InvestmentAccount17.AccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount27#AccumulationRightReference
	 * InvestmentAccount27.AccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#AccumulationRightReference
	 * InvestmentAccount35.AccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#AccumulationRightReference
	 * InvestmentAccount18.AccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount28#AccumulationRightReference
	 * InvestmentAccount28.AccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount36#AccumulationRightReference
	 * InvestmentAccount36.AccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount16#AccumulationRightReference
	 * InvestmentAccount16.AccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount26#AccumulationRightReference
	 * InvestmentAccount26.AccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount34#AccumulationRightReference
	 * InvestmentAccount34.AccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#AccumulationRightReference
	 * SubscriptionOrder3.AccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#AccumulationRightReference
	 * SubscriptionOrder5.AccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#AccumulationRightReference
	 * SubscriptionExecution3.AccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#AccumulationRightReference
	 * SubscriptionExecution5.AccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#AccumulationRightReference
	 * SubscriptionOrder7.AccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder4#AccumulationRightReference
	 * SubscriptionOrder4.AccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#AccumulationRightReference
	 * SubscriptionOrder6.AccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#AccumulationRightReference
	 * SubscriptionExecution4.AccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#AccumulationRightReference
	 * SubscriptionExecution6.AccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#AccumulationRightReference
	 * SubscriptionOrder8.AccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#AccumulationRightReference
	 * InvestmentAccount38.AccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount37#AccumulationRightReference
	 * InvestmentAccount37.AccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount39#AccumulationRightReference
	 * InvestmentAccount39.AccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#AccumulationRightReference
	 * InvestmentAccount46.AccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount47#AccumulationRightReference
	 * InvestmentAccount47.AccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#AccumulationRightReference
	 * InvestmentAccount49.AccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51#AccumulationRightReference
	 * InvestmentAccount51.AccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#AccumulationRightReference
	 * InvestmentAccount50.AccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#AccumulationRightReference
	 * InvestmentAccount61.AccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#AccumulationRightReference
	 * InvestmentAccount63.AccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#AccumulationRightReference
	 * InvestmentAccount62.AccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#AccumulationRightReference
	 * SubscriptionExecution13.AccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#AccumulationRightReference
	 * SubscriptionExecution12.AccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#AccumulationRightReference
	 * SubscriptionOrder15.AccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#AccumulationRightReference
	 * SubscriptionOrder14.AccumulationRightReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract
	 * InvestmentAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccumulationRightReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference of an accumulation rights program, in which sales commissions are based on a customer's present purchases of shares and the aggregate quantity previously purchased by the customer. An accumulation rights program is mainly used in the US market."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AccumulationRightReference = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount17.AccumulationRightReference, com.tools20022.repository.msg.InvestmentAccount27.AccumulationRightReference,
					com.tools20022.repository.msg.InvestmentAccount35.AccumulationRightReference, com.tools20022.repository.msg.InvestmentAccount18.AccumulationRightReference,
					com.tools20022.repository.msg.InvestmentAccount28.AccumulationRightReference, com.tools20022.repository.msg.InvestmentAccount36.AccumulationRightReference,
					com.tools20022.repository.msg.InvestmentAccount16.AccumulationRightReference, com.tools20022.repository.msg.InvestmentAccount26.AccumulationRightReference,
					com.tools20022.repository.msg.InvestmentAccount34.AccumulationRightReference, com.tools20022.repository.msg.SubscriptionOrder3.AccumulationRightReference,
					com.tools20022.repository.msg.SubscriptionOrder5.AccumulationRightReference, com.tools20022.repository.msg.SubscriptionExecution3.AccumulationRightReference,
					com.tools20022.repository.msg.SubscriptionExecution5.AccumulationRightReference, com.tools20022.repository.msg.SubscriptionOrder7.AccumulationRightReference,
					com.tools20022.repository.msg.SubscriptionOrder4.AccumulationRightReference, com.tools20022.repository.msg.SubscriptionOrder6.AccumulationRightReference,
					com.tools20022.repository.msg.SubscriptionExecution4.AccumulationRightReference, com.tools20022.repository.msg.SubscriptionExecution6.AccumulationRightReference,
					com.tools20022.repository.msg.SubscriptionOrder8.AccumulationRightReference, com.tools20022.repository.msg.InvestmentAccount38.AccumulationRightReference,
					com.tools20022.repository.msg.InvestmentAccount37.AccumulationRightReference, com.tools20022.repository.msg.InvestmentAccount39.AccumulationRightReference,
					com.tools20022.repository.msg.InvestmentAccount46.AccumulationRightReference, com.tools20022.repository.msg.InvestmentAccount47.AccumulationRightReference,
					com.tools20022.repository.msg.InvestmentAccount49.AccumulationRightReference, com.tools20022.repository.msg.InvestmentAccount51.AccumulationRightReference,
					com.tools20022.repository.msg.InvestmentAccount50.AccumulationRightReference, com.tools20022.repository.msg.InvestmentAccount61.AccumulationRightReference,
					com.tools20022.repository.msg.InvestmentAccount63.AccumulationRightReference, com.tools20022.repository.msg.InvestmentAccount62.AccumulationRightReference,
					com.tools20022.repository.msg.SubscriptionExecution13.AccumulationRightReference, com.tools20022.repository.msg.SubscriptionExecution12.AccumulationRightReference,
					com.tools20022.repository.msg.SubscriptionOrder15.AccumulationRightReference, com.tools20022.repository.msg.SubscriptionOrder14.AccumulationRightReference);
			elementContext_lazy = () -> InvestmentAccountContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccumulationRightReference";
			definition = "Reference of an accumulation rights program, in which sales commissions are based on a customer's present purchases of shares and the aggregate quantity previously purchased by the customer. An accumulation rights program is mainly used in the US market.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the account for which the service is offered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#InvestmentAccountContract
	 * InvestmentAccount.InvestmentAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract
	 * InvestmentAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the account for which the service is offered."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestmentAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentAccountContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccount";
			definition = "Specifies the account for which the service is offered.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.InvestmentAccountContract;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Services linked to an account which are available to the account owner or
	 * to the holder of a mandate. The exercise of these services may be
	 * submitted to a limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#InvestmentAccountContract
	 * InvestmentAccountService.InvestmentAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService
	 * InvestmentAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract
	 * InvestmentAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Services"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Services linked to an account which are available to the account owner or to the holder of a mandate. The exercise of these services may be submitted to a limit."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Services = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentAccountContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Services";
			definition = "Services linked to an account which are available to the account owner or to the holder of a mandate. The exercise of these services may be submitted to a limit.";
			minOccurs = 0;
			type_lazy = () -> InvestmentAccountService.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.InvestmentAccountContract;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Product which provides guidance to investors to manage their portfolios.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ManagedAccountProduct#InvestmentAccountContract
	 * ManagedAccountProduct.InvestmentAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ManagedAccountProduct
	 * ManagedAccountProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract
	 * InvestmentAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModeledAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Product which provides guidance to investors to manage their portfolios."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ModeledAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentAccountContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModeledAccount";
			definition = "Product which provides guidance to investors to manage their portfolios.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ManagedAccountProduct.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ManagedAccountProduct.InvestmentAccountContract;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestmentAccountContract";
				definition = "Contract defining the related investment account.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccount.InvestmentAccountContract, com.tools20022.repository.entity.InvestmentAccountService.InvestmentAccountContract,
						com.tools20022.repository.entity.ManagedAccountProduct.InvestmentAccountContract);
				superType_lazy = () -> AccountContract.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccountContract.LetterIntentReference, com.tools20022.repository.entity.InvestmentAccountContract.AccumulationRightReference,
						com.tools20022.repository.entity.InvestmentAccountContract.InvestmentAccount, com.tools20022.repository.entity.InvestmentAccountContract.Services,
						com.tools20022.repository.entity.InvestmentAccountContract.ModeledAccount);
			}
		});
		return mmObject_lazy.get();
	}
}