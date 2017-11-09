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
import com.tools20022.repository.codeset.BaselineStatusCode;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates the status of a baseline.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="BaselineStatus" src="doc-files/BaselineStatus.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionStatus1
 * TransactionStatus1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionStatus4
 * TransactionStatus4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionStatus3
 * TransactionStatus3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionStatus2
 * TransactionStatus2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionStatus5
 * TransactionStatus5}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmTransactionStatus
 * CommercialTrade.mmTransactionStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.BaselineStatus#mmStatus
 * BaselineStatus.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BaselineStatus#mmCommercialTrade
 * BaselineStatus.mmCommercialTrade}</li>
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
 * "BaselineStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates the status of a baseline."</li>
 * </ul>
 */
public class BaselineStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected BaselineStatusCode status;
	/**
	 * Specifies the status of the processing of a baseline.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BaselineStatusCode
	 * BaselineStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BaselineStatus
	 * BaselineStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionStatus1#mmStatus
	 * TransactionStatus1.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionStatus4#mmStatus
	 * TransactionStatus4.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionStatus3#mmStatus
	 * TransactionStatus3.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionStatus2#mmStatus
	 * TransactionStatus2.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionStatus5#mmStatus
	 * TransactionStatus5.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusReportItems1#mmStatus
	 * StatusReportItems1.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusReportItems2#mmStatus
	 * StatusReportItems2.mmStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of the processing of a baseline."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionStatus1.mmStatus, TransactionStatus4.mmStatus, TransactionStatus3.mmStatus, TransactionStatus2.mmStatus, TransactionStatus5.mmStatus, StatusReportItems1.mmStatus,
					StatusReportItems2.mmStatus);
			elementContext_lazy = () -> BaselineStatus.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Specifies the status of the processing of a baseline.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaselineStatusCode.mmObject();
		}
	};
	protected CommercialTrade commercialTrade;
	/**
	 * Commercial trade for which a status is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmTransactionStatus
	 * CommercialTrade.mmTransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BaselineStatus
	 * BaselineStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commercial trade for which a status is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCommercialTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> BaselineStatus.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CommercialTrade";
			definition = "Commercial trade for which a status is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTrade.mmTransactionStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CommercialTrade.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BaselineStatus";
				definition = "Indicates the status of a baseline.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CommercialTrade.mmTransactionStatus);
				superType_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
				element_lazy = () -> Arrays.asList(BaselineStatus.mmStatus, BaselineStatus.mmCommercialTrade);
				derivationComponent_lazy = () -> Arrays.asList(TransactionStatus1.mmObject(), TransactionStatus4.mmObject(), TransactionStatus3.mmObject(), TransactionStatus2.mmObject(), TransactionStatus5.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public BaselineStatusCode getStatus() {
		return status;
	}

	public void setStatus(BaselineStatusCode status) {
		this.status = status;
	}

	public CommercialTrade getCommercialTrade() {
		return commercialTrade;
	}

	public void setCommercialTrade(com.tools20022.repository.entity.CommercialTrade commercialTrade) {
		this.commercialTrade = commercialTrade;
	}
}