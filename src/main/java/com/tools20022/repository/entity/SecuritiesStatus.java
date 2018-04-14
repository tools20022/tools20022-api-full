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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.RegistrationProcessingStatusCode;
import com.tools20022.repository.codeset.SecuritiesPaymentStatusCode;
import com.tools20022.repository.codeset.SecurityStatusCode;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Specifies the status of the security within its lifecycle.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesStatus" src="doc-files/SecuritiesStatus.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
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
 * <li>{@linkplain com.tools20022.repository.choice.SecurityStatus3Choice
 * SecurityStatus3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesPaymentStatus7Choice
 * SecuritiesPaymentStatus7Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of the security within its lifecycle."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class SecuritiesStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesPaymentStatusCode paymentStatus;
	/**
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesPaymentStatus7Choice#mmCode
	 * SecuritiesPaymentStatus7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesPaymentStatus7Choice#mmProprietary
	 * SecuritiesPaymentStatus7Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes91#mmPaymentStatus
	 * FinancialInstrumentAttributes91.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes92#mmPaymentStatus
	 * FinancialInstrumentAttributes92.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes95#mmPaymentStatus
	 * FinancialInstrumentAttributes95.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmPaymentStatus
	 * FinancialInstrumentAttributes97.mmPaymentStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesStatus
	 * SecuritiesStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of payment of a security at a particular time."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesStatus, SecuritiesPaymentStatusCode> mmPaymentStatus = new MMBusinessAttribute<SecuritiesStatus, SecuritiesPaymentStatusCode>() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesPaymentStatus1Choice.mmCode, SecuritiesPaymentStatus1Choice.mmProprietary, SecuritiesPaymentStatus2Choice.mmCode, SecuritiesPaymentStatus2Choice.mmProprietary,
					FinancialInstrumentAttributes8.mmPaymentStatus, FinancialInstrumentAttributes20.mmPaymentStatus, FinancialInstrumentAttributes35.mmPaymentStatus, SecuritiesPaymentStatus3Choice.mmCode,
					SecuritiesPaymentStatus3Choice.mmProprietary, FinancialInstrumentAttributes41.mmPaymentStatus, FinancialInstrumentAttributes4.mmPaymentStatus, FinancialInstrumentAttributes13.mmPaymentStatus,
					FinancialInstrumentAttributes21.mmPaymentStatus, FinancialInstrumentAttributes26.mmPaymentStatus, FinancialInstrumentAttributes36.mmPaymentStatus, FinancialInstrumentAttributes42.mmPaymentStatus,
					FinancialInstrumentAttributes27.mmPaymentStatus, FinancialInstrumentAttributes14.mmPaymentStatus, FinancialInstrumentAttributes30.mmPaymentStatus, FinancialInstrumentAttributes28.mmPaymentStatus,
					Equity1.mmPaymentStatus, FinancialInstrumentAttributes15.mmPaymentStatus, FinancialInstrumentAttributes29.mmPaymentStatus, SecuritiesPaymentStatus4Choice.mmCode, SecuritiesPaymentStatus4Choice.mmProprietary,
					FinancialInstrumentAttributes2.mmPaymentStatus, FinancialInstrumentAttributes63.mmPaymentStatus, FinancialInstrumentAttributes64.mmPaymentStatus, SecuritiesPaymentStatus5Choice.mmCode,
					SecuritiesPaymentStatus5Choice.mmProprietary, FinancialInstrumentAttributes75.mmPaymentStatus, FinancialInstrumentAttributes78.mmPaymentStatus, SecuritiesPaymentStatus6Choice.mmCode,
					SecuritiesPaymentStatus6Choice.mmProprietary, SecuritiesPaymentStatus7Choice.mmCode, SecuritiesPaymentStatus7Choice.mmProprietary, FinancialInstrumentAttributes91.mmPaymentStatus,
					FinancialInstrumentAttributes92.mmPaymentStatus, FinancialInstrumentAttributes95.mmPaymentStatus, FinancialInstrumentAttributes97.mmPaymentStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentStatus";
			definition = "Status of payment of a security at a particular time.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SecuritiesPaymentStatusCode.mmObject();
		}

		@Override
		public SecuritiesPaymentStatusCode getValue(SecuritiesStatus obj) {
			return obj.getPaymentStatus();
		}

		@Override
		public void setValue(SecuritiesStatus obj, SecuritiesPaymentStatusCode value) {
			obj.setPaymentStatus(value);
		}
	};
	protected SecurityStatusCode status;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmSecurityStatus
	 * FinancialInstrumentAttributes1.mmSecurityStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesStatus
	 * SecuritiesStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status of the security within its lifecycle."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesStatus, SecurityStatusCode> mmStatus = new MMBusinessAttribute<SecuritiesStatus, SecurityStatusCode>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes1.mmSecurityStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Specifies the status of the security within its lifecycle.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SecurityStatusCode.mmObject();
		}

		@Override
		public SecurityStatusCode getValue(SecuritiesStatus obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(SecuritiesStatus obj, SecurityStatusCode value) {
			obj.setStatus(value);
		}
	};
	protected RegistrationProcessingStatusCode registrationStatus;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesStatus
	 * SecuritiesStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status of the registration of the securities."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesStatus, RegistrationProcessingStatusCode> mmRegistrationStatus = new MMBusinessAttribute<SecuritiesStatus, RegistrationProcessingStatusCode>() {
		{
			derivation_lazy = () -> Arrays.asList(RegistrationProcessingStatus1Choice.mmCode, RegistrationProcessingStatus2Choice.mmCode, RegistrationProcessingStatus3Choice.mmCode, RegistrationProcessingStatus4Choice.mmCode);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegistrationStatus";
			definition = "Specifies the status of the registration of the securities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RegistrationProcessingStatusCode.mmObject();
		}

		@Override
		public RegistrationProcessingStatusCode getValue(SecuritiesStatus obj) {
			return obj.getRegistrationStatus();
		}

		@Override
		public void setValue(SecuritiesStatus obj, RegistrationProcessingStatusCode value) {
			obj.setRegistrationStatus(value);
		}
	};
	protected Security security;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSecurityStatus
	 * Security.mmSecurityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesStatus
	 * SecuritiesStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security for which a status is provided."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesStatus, Optional<Security>> mmSecurity = new MMBusinessAssociationEnd<SecuritiesStatus, Optional<Security>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security for which a status is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmSecurityStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}

		@Override
		public Optional<Security> getValue(SecuritiesStatus obj) {
			return obj.getSecurity();
		}

		@Override
		public void setValue(SecuritiesStatus obj, Optional<Security> value) {
			obj.setSecurity(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesStatus";
				definition = "Specifies the status of the security within its lifecycle.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmSecurityStatus);
				superType_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesStatus.mmPaymentStatus, com.tools20022.repository.entity.SecuritiesStatus.mmStatus,
						com.tools20022.repository.entity.SecuritiesStatus.mmRegistrationStatus, com.tools20022.repository.entity.SecuritiesStatus.mmSecurity);
				derivationComponent_lazy = () -> Arrays.asList(SecuritiesPaymentStatus1Choice.mmObject(), SecuritiesPaymentStatus2Choice.mmObject(), SecuritiesPaymentStatus3Choice.mmObject(), SecurityStatus2Choice.mmObject(),
						SecuritiesPaymentStatus4Choice.mmObject(), SecuritiesPaymentStatus5Choice.mmObject(), SecuritiesPaymentStatus6Choice.mmObject(), SecurityStatus3Choice.mmObject(), SecuritiesPaymentStatus7Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesStatus.class;
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesPaymentStatusCode getPaymentStatus() {
		return paymentStatus;
	}

	public SecuritiesStatus setPaymentStatus(SecuritiesPaymentStatusCode paymentStatus) {
		this.paymentStatus = Objects.requireNonNull(paymentStatus);
		return this;
	}

	public SecurityStatusCode getStatus() {
		return status;
	}

	public SecuritiesStatus setStatus(SecurityStatusCode status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public RegistrationProcessingStatusCode getRegistrationStatus() {
		return registrationStatus;
	}

	public SecuritiesStatus setRegistrationStatus(RegistrationProcessingStatusCode registrationStatus) {
		this.registrationStatus = Objects.requireNonNull(registrationStatus);
		return this;
	}

	public Optional<Security> getSecurity() {
		return security == null ? Optional.empty() : Optional.of(security);
	}

	public SecuritiesStatus setSecurity(com.tools20022.repository.entity.Security security) {
		this.security = security;
		return this;
	}
}