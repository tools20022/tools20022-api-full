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
 * {@linkplain com.tools20022.repository.entity.SecuritiesStatus#mmPaymentStatus
 * SecuritiesStatus.mmPaymentStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesStatus#mmStatus
 * SecuritiesStatus.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesStatus#mmRegistrationStatus
 * SecuritiesStatus.mmRegistrationStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesStatus#mmSecurity
 * SecuritiesStatus.mmSecurity}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmSecurityStatus
 * Security.mmSecurityStatus}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected SecuritiesPaymentStatusCode paymentStatus;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesStatus
	 * SecuritiesStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesPaymentStatus1Choice#mmCode
	 * SecuritiesPaymentStatus1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesPaymentStatus1Choice#mmProprietary
	 * SecuritiesPaymentStatus1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesPaymentStatus2Choice#mmCode
	 * SecuritiesPaymentStatus2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesPaymentStatus2Choice#mmProprietary
	 * SecuritiesPaymentStatus2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#mmPaymentStatus
	 * FinancialInstrumentAttributes8.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#mmPaymentStatus
	 * FinancialInstrumentAttributes20.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmPaymentStatus
	 * FinancialInstrumentAttributes35.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesPaymentStatus3Choice#mmCode
	 * SecuritiesPaymentStatus3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesPaymentStatus3Choice#mmProprietary
	 * SecuritiesPaymentStatus3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#mmPaymentStatus
	 * FinancialInstrumentAttributes41.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#mmPaymentStatus
	 * FinancialInstrumentAttributes4.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#mmPaymentStatus
	 * FinancialInstrumentAttributes13.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#mmPaymentStatus
	 * FinancialInstrumentAttributes21.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#mmPaymentStatus
	 * FinancialInstrumentAttributes26.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmPaymentStatus
	 * FinancialInstrumentAttributes36.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#mmPaymentStatus
	 * FinancialInstrumentAttributes42.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#mmPaymentStatus
	 * FinancialInstrumentAttributes27.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#mmPaymentStatus
	 * FinancialInstrumentAttributes14.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#mmPaymentStatus
	 * FinancialInstrumentAttributes30.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#mmPaymentStatus
	 * FinancialInstrumentAttributes28.mmPaymentStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Equity1#mmPaymentStatus
	 * Equity1.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#mmPaymentStatus
	 * FinancialInstrumentAttributes15.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#mmPaymentStatus
	 * FinancialInstrumentAttributes29.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesPaymentStatus4Choice#mmCode
	 * SecuritiesPaymentStatus4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesPaymentStatus4Choice#mmProprietary
	 * SecuritiesPaymentStatus4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#mmPaymentStatus
	 * FinancialInstrumentAttributes2.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmPaymentStatus
	 * FinancialInstrumentAttributes63.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmPaymentStatus
	 * FinancialInstrumentAttributes64.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesPaymentStatus5Choice#mmCode
	 * SecuritiesPaymentStatus5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesPaymentStatus5Choice#mmProprietary
	 * SecuritiesPaymentStatus5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#mmPaymentStatus
	 * FinancialInstrumentAttributes75.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#mmPaymentStatus
	 * FinancialInstrumentAttributes78.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesPaymentStatus6Choice#mmCode
	 * SecuritiesPaymentStatus6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesPaymentStatus6Choice#mmProprietary
	 * SecuritiesPaymentStatus6Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmPaymentStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecuritiesPaymentStatus1Choice.mmCode, com.tools20022.repository.choice.SecuritiesPaymentStatus1Choice.mmProprietary,
					com.tools20022.repository.choice.SecuritiesPaymentStatus2Choice.mmCode, com.tools20022.repository.choice.SecuritiesPaymentStatus2Choice.mmProprietary,
					com.tools20022.repository.msg.FinancialInstrumentAttributes8.mmPaymentStatus, com.tools20022.repository.msg.FinancialInstrumentAttributes20.mmPaymentStatus,
					com.tools20022.repository.msg.FinancialInstrumentAttributes35.mmPaymentStatus, com.tools20022.repository.choice.SecuritiesPaymentStatus3Choice.mmCode,
					com.tools20022.repository.choice.SecuritiesPaymentStatus3Choice.mmProprietary, com.tools20022.repository.msg.FinancialInstrumentAttributes41.mmPaymentStatus,
					com.tools20022.repository.msg.FinancialInstrumentAttributes4.mmPaymentStatus, com.tools20022.repository.msg.FinancialInstrumentAttributes13.mmPaymentStatus,
					com.tools20022.repository.msg.FinancialInstrumentAttributes21.mmPaymentStatus, com.tools20022.repository.msg.FinancialInstrumentAttributes26.mmPaymentStatus,
					com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmPaymentStatus, com.tools20022.repository.msg.FinancialInstrumentAttributes42.mmPaymentStatus,
					com.tools20022.repository.msg.FinancialInstrumentAttributes27.mmPaymentStatus, com.tools20022.repository.msg.FinancialInstrumentAttributes14.mmPaymentStatus,
					com.tools20022.repository.msg.FinancialInstrumentAttributes30.mmPaymentStatus, com.tools20022.repository.msg.FinancialInstrumentAttributes28.mmPaymentStatus, com.tools20022.repository.msg.Equity1.mmPaymentStatus,
					com.tools20022.repository.msg.FinancialInstrumentAttributes15.mmPaymentStatus, com.tools20022.repository.msg.FinancialInstrumentAttributes29.mmPaymentStatus,
					com.tools20022.repository.choice.SecuritiesPaymentStatus4Choice.mmCode, com.tools20022.repository.choice.SecuritiesPaymentStatus4Choice.mmProprietary,
					com.tools20022.repository.msg.FinancialInstrumentAttributes2.mmPaymentStatus, com.tools20022.repository.msg.FinancialInstrumentAttributes63.mmPaymentStatus,
					com.tools20022.repository.msg.FinancialInstrumentAttributes64.mmPaymentStatus, com.tools20022.repository.choice.SecuritiesPaymentStatus5Choice.mmCode,
					com.tools20022.repository.choice.SecuritiesPaymentStatus5Choice.mmProprietary, com.tools20022.repository.msg.FinancialInstrumentAttributes75.mmPaymentStatus,
					com.tools20022.repository.msg.FinancialInstrumentAttributes78.mmPaymentStatus, com.tools20022.repository.choice.SecuritiesPaymentStatus6Choice.mmCode,
					com.tools20022.repository.choice.SecuritiesPaymentStatus6Choice.mmProprietary);
			elementContext_lazy = () -> SecuritiesStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentStatus";
			definition = "Status of payment of a security at a particular time.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SecuritiesPaymentStatusCode.mmObject();
		}
	};
	protected SecurityStatusCode status;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesStatus
	 * SecuritiesStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmSecurityStatus
	 * FinancialInstrumentAttributes1.mmSecurityStatus}</li>
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
	 * definition} =
	 * "Specifies the status of the security within its lifecycle."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmSecurityStatus);
			elementContext_lazy = () -> SecuritiesStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Specifies the status of the security within its lifecycle.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SecurityStatusCode.mmObject();
		}
	};
	protected RegistrationProcessingStatusCode registrationStatus;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesStatus
	 * SecuritiesStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RegistrationProcessingStatus1Choice#mmCode
	 * RegistrationProcessingStatus1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RegistrationProcessingStatus2Choice#mmCode
	 * RegistrationProcessingStatus2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RegistrationProcessingStatus3Choice#mmCode
	 * RegistrationProcessingStatus3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RegistrationProcessingStatus4Choice#mmCode
	 * RegistrationProcessingStatus4Choice.mmCode}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmRegistrationStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.RegistrationProcessingStatus1Choice.mmCode, com.tools20022.repository.choice.RegistrationProcessingStatus2Choice.mmCode,
					com.tools20022.repository.choice.RegistrationProcessingStatus3Choice.mmCode, com.tools20022.repository.choice.RegistrationProcessingStatus4Choice.mmCode);
			elementContext_lazy = () -> SecuritiesStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegistrationStatus";
			definition = "Specifies the status of the registration of the securities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RegistrationProcessingStatusCode.mmObject();
		}
	};
	protected Security security;
	/**
	 * Security for which a status is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSecurityStatus
	 * Security.mmSecurityStatus}</li>
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
	public static final MMBusinessAssociationEnd mmSecurity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security for which a status is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmSecurityStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesStatus";
				definition = "Specifies the status of the security within its lifecycle.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmSecurityStatus);
				superType_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesStatus.mmPaymentStatus, com.tools20022.repository.entity.SecuritiesStatus.mmStatus,
						com.tools20022.repository.entity.SecuritiesStatus.mmRegistrationStatus, com.tools20022.repository.entity.SecuritiesStatus.mmSecurity);
				derivationComponent_lazy = () -> Arrays.asList(SecuritiesPaymentStatus1Choice.mmObject(), SecuritiesPaymentStatus2Choice.mmObject(), SecuritiesPaymentStatus3Choice.mmObject(), SecurityStatus2Choice.mmObject(),
						SecuritiesPaymentStatus4Choice.mmObject(), SecuritiesPaymentStatus5Choice.mmObject(), SecuritiesPaymentStatus6Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesPaymentStatusCode getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(SecuritiesPaymentStatusCode paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public SecurityStatusCode getStatus() {
		return status;
	}

	public void setStatus(SecurityStatusCode status) {
		this.status = status;
	}

	public RegistrationProcessingStatusCode getRegistrationStatus() {
		return registrationStatus;
	}

	public void setRegistrationStatus(RegistrationProcessingStatusCode registrationStatus) {
		this.registrationStatus = registrationStatus;
	}

	public Security getSecurity() {
		return security;
	}

	public void setSecurity(com.tools20022.repository.entity.Security security) {
		this.security = security;
	}
}