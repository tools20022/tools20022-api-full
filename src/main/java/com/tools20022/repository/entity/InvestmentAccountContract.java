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
import java.util.List;

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
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract#mmLetterIntentReference
 * InvestmentAccountContract.mmLetterIntentReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract#mmAccumulationRightReference
 * InvestmentAccountContract.mmAccumulationRightReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract#mmInvestmentAccount
 * InvestmentAccountContract.mmInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract#mmServices
 * InvestmentAccountContract.mmServices}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract#mmModeledAccount
 * InvestmentAccountContract.mmModeledAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentAccountContract
 * InvestmentAccount.mmInvestmentAccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmInvestmentAccountContract
 * InvestmentAccountService.mmInvestmentAccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ManagedAccountProduct#mmInvestmentAccountContract
 * ManagedAccountProduct.mmInvestmentAccountContract}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.AccountContract
 * AccountContract}</li>
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
 * "InvestmentAccountContract"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Contract defining the related investment account."</li>
 * </ul>
 */
public class InvestmentAccountContract extends AccountContract {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text letterIntentReference;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract
	 * InvestmentAccountContract}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount17#mmLetterIntentReference
	 * InvestmentAccount17.mmLetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount27#mmLetterIntentReference
	 * InvestmentAccount27.mmLetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#mmLetterIntentDetails
	 * InvestmentAccount35.mmLetterIntentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmLetterIntentReference
	 * InvestmentAccount18.mmLetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount28#mmLetterIntentReference
	 * InvestmentAccount28.mmLetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount36#mmLetterIntentDetails
	 * InvestmentAccount36.mmLetterIntentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount16#mmLetterIntentReference
	 * InvestmentAccount16.mmLetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount26#mmLetterIntentReference
	 * InvestmentAccount26.mmLetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount34#mmLetterIntentDetails
	 * InvestmentAccount34.mmLetterIntentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmLetterIntentDetails
	 * InvestmentAccount38.mmLetterIntentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount37#mmLetterIntentDetails
	 * InvestmentAccount37.mmLetterIntentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount39#mmLetterIntentDetails
	 * InvestmentAccount39.mmLetterIntentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmLetterIntentDetails
	 * InvestmentAccount46.mmLetterIntentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount47#mmLetterIntentDetails
	 * InvestmentAccount47.mmLetterIntentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#mmLetterIntentDetails
	 * InvestmentAccount49.mmLetterIntentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51#mmLetterIntentDetails
	 * InvestmentAccount51.mmLetterIntentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmLetterIntentDetails
	 * InvestmentAccount50.mmLetterIntentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#mmLetterIntentDetails
	 * InvestmentAccount61.mmLetterIntentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmLetterIntentDetails
	 * InvestmentAccount63.mmLetterIntentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmLetterIntentDetails
	 * InvestmentAccount62.mmLetterIntentDetails}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmLetterIntentReference = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount17.mmLetterIntentReference, com.tools20022.repository.msg.InvestmentAccount27.mmLetterIntentReference,
					com.tools20022.repository.msg.InvestmentAccount35.mmLetterIntentDetails, com.tools20022.repository.msg.InvestmentAccount18.mmLetterIntentReference,
					com.tools20022.repository.msg.InvestmentAccount28.mmLetterIntentReference, com.tools20022.repository.msg.InvestmentAccount36.mmLetterIntentDetails,
					com.tools20022.repository.msg.InvestmentAccount16.mmLetterIntentReference, com.tools20022.repository.msg.InvestmentAccount26.mmLetterIntentReference,
					com.tools20022.repository.msg.InvestmentAccount34.mmLetterIntentDetails, com.tools20022.repository.msg.InvestmentAccount38.mmLetterIntentDetails, com.tools20022.repository.msg.InvestmentAccount37.mmLetterIntentDetails,
					com.tools20022.repository.msg.InvestmentAccount39.mmLetterIntentDetails, com.tools20022.repository.msg.InvestmentAccount46.mmLetterIntentDetails, com.tools20022.repository.msg.InvestmentAccount47.mmLetterIntentDetails,
					com.tools20022.repository.msg.InvestmentAccount49.mmLetterIntentDetails, com.tools20022.repository.msg.InvestmentAccount51.mmLetterIntentDetails, com.tools20022.repository.msg.InvestmentAccount50.mmLetterIntentDetails,
					com.tools20022.repository.msg.InvestmentAccount61.mmLetterIntentDetails, com.tools20022.repository.msg.InvestmentAccount63.mmLetterIntentDetails, com.tools20022.repository.msg.InvestmentAccount62.mmLetterIntentDetails);
			elementContext_lazy = () -> InvestmentAccountContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LetterIntentReference";
			definition = "Reference of a letter of intent program, in which sales commissions are reduced based on the aggregate of a customer's actual purchase and anticipated purchases, over a specific period of time, and as agreed by the customer. A letter of intent program is mainly used in the US market.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text accumulationRightReference;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract
	 * InvestmentAccountContract}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount17#mmAccumulationRightReference
	 * InvestmentAccount17.mmAccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount27#mmAccumulationRightReference
	 * InvestmentAccount27.mmAccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#mmAccumulationRightReference
	 * InvestmentAccount35.mmAccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmAccumulationRightReference
	 * InvestmentAccount18.mmAccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount28#mmAccumulationRightReference
	 * InvestmentAccount28.mmAccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount36#mmAccumulationRightReference
	 * InvestmentAccount36.mmAccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount16#mmAccumulationRightReference
	 * InvestmentAccount16.mmAccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount26#mmAccumulationRightReference
	 * InvestmentAccount26.mmAccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount34#mmAccumulationRightReference
	 * InvestmentAccount34.mmAccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#mmAccumulationRightReference
	 * SubscriptionOrder3.mmAccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmAccumulationRightReference
	 * SubscriptionOrder5.mmAccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#mmAccumulationRightReference
	 * SubscriptionExecution3.mmAccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmAccumulationRightReference
	 * SubscriptionExecution5.mmAccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmAccumulationRightReference
	 * SubscriptionOrder7.mmAccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder4#mmAccumulationRightReference
	 * SubscriptionOrder4.mmAccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#mmAccumulationRightReference
	 * SubscriptionOrder6.mmAccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#mmAccumulationRightReference
	 * SubscriptionExecution4.mmAccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmAccumulationRightReference
	 * SubscriptionExecution6.mmAccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#mmAccumulationRightReference
	 * SubscriptionOrder8.mmAccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmAccumulationRightReference
	 * InvestmentAccount38.mmAccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount37#mmAccumulationRightReference
	 * InvestmentAccount37.mmAccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount39#mmAccumulationRightReference
	 * InvestmentAccount39.mmAccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmAccumulationRightReference
	 * InvestmentAccount46.mmAccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount47#mmAccumulationRightReference
	 * InvestmentAccount47.mmAccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#mmAccumulationRightReference
	 * InvestmentAccount49.mmAccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51#mmAccumulationRightReference
	 * InvestmentAccount51.mmAccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmAccumulationRightReference
	 * InvestmentAccount50.mmAccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#mmAccumulationRightReference
	 * InvestmentAccount61.mmAccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmAccumulationRightReference
	 * InvestmentAccount63.mmAccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmAccumulationRightReference
	 * InvestmentAccount62.mmAccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmAccumulationRightReference
	 * SubscriptionExecution13.mmAccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmAccumulationRightReference
	 * SubscriptionExecution12.mmAccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmAccumulationRightReference
	 * SubscriptionOrder15.mmAccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmAccumulationRightReference
	 * SubscriptionOrder14.mmAccumulationRightReference}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmAccumulationRightReference = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount17.mmAccumulationRightReference, com.tools20022.repository.msg.InvestmentAccount27.mmAccumulationRightReference,
					com.tools20022.repository.msg.InvestmentAccount35.mmAccumulationRightReference, com.tools20022.repository.msg.InvestmentAccount18.mmAccumulationRightReference,
					com.tools20022.repository.msg.InvestmentAccount28.mmAccumulationRightReference, com.tools20022.repository.msg.InvestmentAccount36.mmAccumulationRightReference,
					com.tools20022.repository.msg.InvestmentAccount16.mmAccumulationRightReference, com.tools20022.repository.msg.InvestmentAccount26.mmAccumulationRightReference,
					com.tools20022.repository.msg.InvestmentAccount34.mmAccumulationRightReference, com.tools20022.repository.msg.SubscriptionOrder3.mmAccumulationRightReference,
					com.tools20022.repository.msg.SubscriptionOrder5.mmAccumulationRightReference, com.tools20022.repository.msg.SubscriptionExecution3.mmAccumulationRightReference,
					com.tools20022.repository.msg.SubscriptionExecution5.mmAccumulationRightReference, com.tools20022.repository.msg.SubscriptionOrder7.mmAccumulationRightReference,
					com.tools20022.repository.msg.SubscriptionOrder4.mmAccumulationRightReference, com.tools20022.repository.msg.SubscriptionOrder6.mmAccumulationRightReference,
					com.tools20022.repository.msg.SubscriptionExecution4.mmAccumulationRightReference, com.tools20022.repository.msg.SubscriptionExecution6.mmAccumulationRightReference,
					com.tools20022.repository.msg.SubscriptionOrder8.mmAccumulationRightReference, com.tools20022.repository.msg.InvestmentAccount38.mmAccumulationRightReference,
					com.tools20022.repository.msg.InvestmentAccount37.mmAccumulationRightReference, com.tools20022.repository.msg.InvestmentAccount39.mmAccumulationRightReference,
					com.tools20022.repository.msg.InvestmentAccount46.mmAccumulationRightReference, com.tools20022.repository.msg.InvestmentAccount47.mmAccumulationRightReference,
					com.tools20022.repository.msg.InvestmentAccount49.mmAccumulationRightReference, com.tools20022.repository.msg.InvestmentAccount51.mmAccumulationRightReference,
					com.tools20022.repository.msg.InvestmentAccount50.mmAccumulationRightReference, com.tools20022.repository.msg.InvestmentAccount61.mmAccumulationRightReference,
					com.tools20022.repository.msg.InvestmentAccount63.mmAccumulationRightReference, com.tools20022.repository.msg.InvestmentAccount62.mmAccumulationRightReference,
					com.tools20022.repository.msg.SubscriptionExecution13.mmAccumulationRightReference, com.tools20022.repository.msg.SubscriptionExecution12.mmAccumulationRightReference,
					com.tools20022.repository.msg.SubscriptionOrder15.mmAccumulationRightReference, com.tools20022.repository.msg.SubscriptionOrder14.mmAccumulationRightReference);
			elementContext_lazy = () -> InvestmentAccountContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccumulationRightReference";
			definition = "Reference of an accumulation rights program, in which sales commissions are based on a customer's present purchases of shares and the aggregate quantity previously purchased by the customer. An accumulation rights program is mainly used in the US market.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.InvestmentAccount> investmentAccount;
	/**
	 * Specifies the account for which the service is offered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentAccountContract
	 * InvestmentAccount.mmInvestmentAccountContract}</li>
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
	public static final MMBusinessAssociationEnd mmInvestmentAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentAccountContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccount";
			definition = "Specifies the account for which the service is offered.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmInvestmentAccountContract;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.InvestmentAccountService> services;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmInvestmentAccountContract
	 * InvestmentAccountService.mmInvestmentAccountContract}</li>
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
	public static final MMBusinessAssociationEnd mmServices = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentAccountContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Services";
			definition = "Services linked to an account which are available to the account owner or to the holder of a mandate. The exercise of these services may be submitted to a limit.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.mmInvestmentAccountContract;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.mmObject();
		}
	};
	protected ManagedAccountProduct modeledAccount;
	/**
	 * Product which provides guidance to investors to manage their portfolios.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ManagedAccountProduct#mmInvestmentAccountContract
	 * ManagedAccountProduct.mmInvestmentAccountContract}</li>
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
	public static final MMBusinessAssociationEnd mmModeledAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentAccountContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModeledAccount";
			definition = "Product which provides guidance to investors to manage their portfolios.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ManagedAccountProduct.mmInvestmentAccountContract;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ManagedAccountProduct.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestmentAccountContract";
				definition = "Contract defining the related investment account.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccount.mmInvestmentAccountContract, com.tools20022.repository.entity.InvestmentAccountService.mmInvestmentAccountContract,
						com.tools20022.repository.entity.ManagedAccountProduct.mmInvestmentAccountContract);
				superType_lazy = () -> AccountContract.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccountContract.mmLetterIntentReference, com.tools20022.repository.entity.InvestmentAccountContract.mmAccumulationRightReference,
						com.tools20022.repository.entity.InvestmentAccountContract.mmInvestmentAccount, com.tools20022.repository.entity.InvestmentAccountContract.mmServices,
						com.tools20022.repository.entity.InvestmentAccountContract.mmModeledAccount);
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getLetterIntentReference() {
		return letterIntentReference;
	}

	public void setLetterIntentReference(Max35Text letterIntentReference) {
		this.letterIntentReference = letterIntentReference;
	}

	public Max35Text getAccumulationRightReference() {
		return accumulationRightReference;
	}

	public void setAccumulationRightReference(Max35Text accumulationRightReference) {
		this.accumulationRightReference = accumulationRightReference;
	}

	public List<InvestmentAccount> getInvestmentAccount() {
		return investmentAccount;
	}

	public void setInvestmentAccount(List<com.tools20022.repository.entity.InvestmentAccount> investmentAccount) {
		this.investmentAccount = investmentAccount;
	}

	public List<InvestmentAccountService> getServices() {
		return services;
	}

	public void setServices(List<com.tools20022.repository.entity.InvestmentAccountService> services) {
		this.services = services;
	}

	public ManagedAccountProduct getModeledAccount() {
		return modeledAccount;
	}

	public void setModeledAccount(com.tools20022.repository.entity.ManagedAccountProduct modeledAccount) {
		this.modeledAccount = modeledAccount;
	}
}