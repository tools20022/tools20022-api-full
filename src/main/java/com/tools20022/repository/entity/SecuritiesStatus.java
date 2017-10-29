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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.RegistrationProcessingStatusCode;
import com.tools20022.repository.codeset.SecuritiesPaymentStatusCode;
import com.tools20022.repository.codeset.SecurityStatusCode;
import com.tools20022.repository.entity.Status;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the status of the security within its lifecycle.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesStatus" src="doc-files/SecuritiesStatus.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesStatus#PaymentStatus
 * SecuritiesStatus.PaymentStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesStatus#Status
 * SecuritiesStatus.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesStatus#RegistrationStatus
 * SecuritiesStatus.RegistrationStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesStatus#Security
 * SecuritiesStatus.Security}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#SecurityStatus
 * Security.SecurityStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesPaymentStatus1Choice
 * SecuritiesPaymentStatus1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesPaymentStatus2Choice
 * SecuritiesPaymentStatus2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesPaymentStatus3Choice
 * SecuritiesPaymentStatus3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SecurityStatus2Choice
 * SecurityStatus2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesPaymentStatus4Choice
 * SecuritiesPaymentStatus4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesPaymentStatus5Choice
 * SecuritiesPaymentStatus5Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesPaymentStatus6Choice
 * SecuritiesPaymentStatus6Choice}</li>
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
 * "SecuritiesStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of the security within its lifecycle."</li>
 * </ul>
 */
public class SecuritiesStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Status of payment of a security at a particular time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesPaymentStatusCode
	 * SecuritiesPaymentStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesPaymentStatus1Choice#Code
	 * SecuritiesPaymentStatus1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesPaymentStatus1Choice#Proprietary
	 * SecuritiesPaymentStatus1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesPaymentStatus2Choice#Code
	 * SecuritiesPaymentStatus2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesPaymentStatus2Choice#Proprietary
	 * SecuritiesPaymentStatus2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#PaymentStatus
	 * FinancialInstrumentAttributes8.PaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#PaymentStatus
	 * FinancialInstrumentAttributes20.PaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#PaymentStatus
	 * FinancialInstrumentAttributes35.PaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesPaymentStatus3Choice#Code
	 * SecuritiesPaymentStatus3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesPaymentStatus3Choice#Proprietary
	 * SecuritiesPaymentStatus3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#PaymentStatus
	 * FinancialInstrumentAttributes41.PaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#PaymentStatus
	 * FinancialInstrumentAttributes4.PaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#PaymentStatus
	 * FinancialInstrumentAttributes13.PaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#PaymentStatus
	 * FinancialInstrumentAttributes21.PaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#PaymentStatus
	 * FinancialInstrumentAttributes26.PaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#PaymentStatus
	 * FinancialInstrumentAttributes36.PaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#PaymentStatus
	 * FinancialInstrumentAttributes42.PaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#PaymentStatus
	 * FinancialInstrumentAttributes27.PaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#PaymentStatus
	 * FinancialInstrumentAttributes14.PaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#PaymentStatus
	 * FinancialInstrumentAttributes30.PaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#PaymentStatus
	 * FinancialInstrumentAttributes28.PaymentStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Equity1#PaymentStatus
	 * Equity1.PaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#PaymentStatus
	 * FinancialInstrumentAttributes15.PaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#PaymentStatus
	 * FinancialInstrumentAttributes29.PaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesPaymentStatus4Choice#Code
	 * SecuritiesPaymentStatus4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesPaymentStatus4Choice#Proprietary
	 * SecuritiesPaymentStatus4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#PaymentStatus
	 * FinancialInstrumentAttributes2.PaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#PaymentStatus
	 * FinancialInstrumentAttributes63.PaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#PaymentStatus
	 * FinancialInstrumentAttributes64.PaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesPaymentStatus5Choice#Code
	 * SecuritiesPaymentStatus5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesPaymentStatus5Choice#Proprietary
	 * SecuritiesPaymentStatus5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#PaymentStatus
	 * FinancialInstrumentAttributes75.PaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#PaymentStatus
	 * FinancialInstrumentAttributes78.PaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesPaymentStatus6Choice#Code
	 * SecuritiesPaymentStatus6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesPaymentStatus6Choice#Proprietary
	 * SecuritiesPaymentStatus6Choice.Proprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesStatus
	 * SecuritiesStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of payment of a security at a particular time."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PaymentStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecuritiesPaymentStatus1Choice.Code, com.tools20022.repository.choice.SecuritiesPaymentStatus1Choice.Proprietary,
					com.tools20022.repository.choice.SecuritiesPaymentStatus2Choice.Code, com.tools20022.repository.choice.SecuritiesPaymentStatus2Choice.Proprietary,
					com.tools20022.repository.msg.FinancialInstrumentAttributes8.PaymentStatus, com.tools20022.repository.msg.FinancialInstrumentAttributes20.PaymentStatus,
					com.tools20022.repository.msg.FinancialInstrumentAttributes35.PaymentStatus, com.tools20022.repository.choice.SecuritiesPaymentStatus3Choice.Code,
					com.tools20022.repository.choice.SecuritiesPaymentStatus3Choice.Proprietary, com.tools20022.repository.msg.FinancialInstrumentAttributes41.PaymentStatus,
					com.tools20022.repository.msg.FinancialInstrumentAttributes4.PaymentStatus, com.tools20022.repository.msg.FinancialInstrumentAttributes13.PaymentStatus,
					com.tools20022.repository.msg.FinancialInstrumentAttributes21.PaymentStatus, com.tools20022.repository.msg.FinancialInstrumentAttributes26.PaymentStatus,
					com.tools20022.repository.msg.FinancialInstrumentAttributes36.PaymentStatus, com.tools20022.repository.msg.FinancialInstrumentAttributes42.PaymentStatus,
					com.tools20022.repository.msg.FinancialInstrumentAttributes27.PaymentStatus, com.tools20022.repository.msg.FinancialInstrumentAttributes14.PaymentStatus,
					com.tools20022.repository.msg.FinancialInstrumentAttributes30.PaymentStatus, com.tools20022.repository.msg.FinancialInstrumentAttributes28.PaymentStatus, com.tools20022.repository.msg.Equity1.PaymentStatus,
					com.tools20022.repository.msg.FinancialInstrumentAttributes15.PaymentStatus, com.tools20022.repository.msg.FinancialInstrumentAttributes29.PaymentStatus,
					com.tools20022.repository.choice.SecuritiesPaymentStatus4Choice.Code, com.tools20022.repository.choice.SecuritiesPaymentStatus4Choice.Proprietary,
					com.tools20022.repository.msg.FinancialInstrumentAttributes2.PaymentStatus, com.tools20022.repository.msg.FinancialInstrumentAttributes63.PaymentStatus,
					com.tools20022.repository.msg.FinancialInstrumentAttributes64.PaymentStatus, com.tools20022.repository.choice.SecuritiesPaymentStatus5Choice.Code,
					com.tools20022.repository.choice.SecuritiesPaymentStatus5Choice.Proprietary, com.tools20022.repository.msg.FinancialInstrumentAttributes75.PaymentStatus,
					com.tools20022.repository.msg.FinancialInstrumentAttributes78.PaymentStatus, com.tools20022.repository.choice.SecuritiesPaymentStatus6Choice.Code,
					com.tools20022.repository.choice.SecuritiesPaymentStatus6Choice.Proprietary);
			elementContext_lazy = () -> SecuritiesStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentStatus";
			definition = "Status of payment of a security at a particular time.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SecuritiesPaymentStatusCode.mmObject();
		}
	};
	/**
	 * Specifies the status of the security within its lifecycle.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SecurityStatusCode
	 * SecurityStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#SecurityStatus
	 * FinancialInstrumentAttributes1.SecurityStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesStatus
	 * SecuritiesStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status of the security within its lifecycle."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Status = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes1.SecurityStatus);
			elementContext_lazy = () -> SecuritiesStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Specifies the status of the security within its lifecycle.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SecurityStatusCode.mmObject();
		}
	};
	/**
	 * Specifies the status of the registration of the securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RegistrationProcessingStatusCode
	 * RegistrationProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RegistrationProcessingStatus1Choice#Code
	 * RegistrationProcessingStatus1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RegistrationProcessingStatus2Choice#Code
	 * RegistrationProcessingStatus2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RegistrationProcessingStatus3Choice#Code
	 * RegistrationProcessingStatus3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RegistrationProcessingStatus4Choice#Code
	 * RegistrationProcessingStatus4Choice.Code}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesStatus
	 * SecuritiesStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status of the registration of the securities."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RegistrationStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.RegistrationProcessingStatus1Choice.Code, com.tools20022.repository.choice.RegistrationProcessingStatus2Choice.Code,
					com.tools20022.repository.choice.RegistrationProcessingStatus3Choice.Code, com.tools20022.repository.choice.RegistrationProcessingStatus4Choice.Code);
			elementContext_lazy = () -> SecuritiesStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegistrationStatus";
			definition = "Specifies the status of the registration of the securities.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RegistrationProcessingStatusCode.mmObject();
		}
	};
	/**
	 * Security for which a status is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#SecurityStatus
	 * Security.SecurityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesStatus
	 * SecuritiesStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security for which a status is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Security = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security for which a status is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.SecurityStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesStatus";
				definition = "Specifies the status of the security within its lifecycle.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.SecurityStatus);
				superType_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesStatus.PaymentStatus, com.tools20022.repository.entity.SecuritiesStatus.Status,
						com.tools20022.repository.entity.SecuritiesStatus.RegistrationStatus, com.tools20022.repository.entity.SecuritiesStatus.Security);
				derivationComponent_lazy = () -> Arrays.asList(SecuritiesPaymentStatus1Choice.mmObject(), SecuritiesPaymentStatus2Choice.mmObject(), SecuritiesPaymentStatus3Choice.mmObject(), SecurityStatus2Choice.mmObject(),
						SecuritiesPaymentStatus4Choice.mmObject(), SecuritiesPaymentStatus5Choice.mmObject(), SecuritiesPaymentStatus6Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}