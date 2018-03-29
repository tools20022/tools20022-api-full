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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.AuditTrailOrBusinessError1Choice;
import com.tools20022.repository.choice.DateSearchChoice;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CashAccount16;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Report information about cash account reference data.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountAuditTrailReport1#mmCashAccountAuditTrailOrError
 * CashAccountAuditTrailReport1.mmCashAccountAuditTrailOrError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountAuditTrailReport1#mmDatePeriod
 * CashAccountAuditTrailReport1.mmDatePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountAuditTrailReport1#mmCashAccountIdentification
 * CashAccountAuditTrailReport1.mmCashAccountIdentification}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashAccountAuditTrailReport1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Report information about cash account reference data."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccountAuditTrailReport2
 * CashAccountAuditTrailReport2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CashAccountAuditTrailReport1", propOrder = {"cashAccountAuditTrailOrError", "datePeriod", "cashAccountIdentification"})
public class CashAccountAuditTrailReport1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CshAcctAudtTrlOrErr", required = true)
	protected AuditTrailOrBusinessError1Choice cashAccountAuditTrailOrError;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AuditTrailOrBusinessError1Choice
	 * AuditTrailOrBusinessError1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountAuditTrailReport1
	 * CashAccountAuditTrailReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAcctAudtTrlOrErr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountAuditTrailOrError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the returned cash account reference data or error information."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountAuditTrailReport2#mmCashAccountAuditTrailOrError
	 * CashAccountAuditTrailReport2.mmCashAccountAuditTrailOrError}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashAccountAuditTrailReport1, AuditTrailOrBusinessError1Choice> mmCashAccountAuditTrailOrError = new MMMessageAssociationEnd<CashAccountAuditTrailReport1, AuditTrailOrBusinessError1Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountAuditTrailReport1.mmObject();
			isDerived = false;
			xmlTag = "CshAcctAudtTrlOrErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccountAuditTrailOrError";
			definition = "Identifies the returned cash account reference data or error information.";
			nextVersions_lazy = () -> Arrays.asList(CashAccountAuditTrailReport2.mmCashAccountAuditTrailOrError);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AuditTrailOrBusinessError1Choice.mmObject();
		}

		@Override
		public AuditTrailOrBusinessError1Choice getValue(CashAccountAuditTrailReport1 obj) {
			return obj.getCashAccountAuditTrailOrError();
		}

		@Override
		public void setValue(CashAccountAuditTrailReport1 obj, AuditTrailOrBusinessError1Choice value) {
			obj.setCashAccountAuditTrailOrError(value);
		}
	};
	@XmlElement(name = "DtPrd")
	protected DateSearchChoice datePeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateSearchChoice
	 * DateSearchChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountAuditTrailReport1
	 * CashAccountAuditTrailReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DatePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period in dates for which the audit trail is provided."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountAuditTrailReport2#mmDatePeriod
	 * CashAccountAuditTrailReport2.mmDatePeriod}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccountAuditTrailReport1, Optional<DateSearchChoice>> mmDatePeriod = new MMMessageAttribute<CashAccountAuditTrailReport1, Optional<DateSearchChoice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountAuditTrailReport1.mmObject();
			isDerived = false;
			xmlTag = "DtPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DatePeriod";
			definition = "Period in dates for which the audit trail is provided.";
			nextVersions_lazy = () -> Arrays.asList(CashAccountAuditTrailReport2.mmDatePeriod);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateSearchChoice.mmObject();
		}

		@Override
		public Optional<DateSearchChoice> getValue(CashAccountAuditTrailReport1 obj) {
			return obj.getDatePeriod();
		}

		@Override
		public void setValue(CashAccountAuditTrailReport1 obj, Optional<DateSearchChoice> value) {
			obj.setDatePeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "CshAcctId", required = true)
	protected CashAccount16 cashAccountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CashAccount16
	 * CashAccount16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountAuditTrailReport1
	 * CashAccountAuditTrailReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the cash account for which the audit trail is provided."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountAuditTrailReport2#mmCashAccountIdentification
	 * CashAccountAuditTrailReport2.mmCashAccountIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccountAuditTrailReport1, CashAccount16> mmCashAccountIdentification = new MMMessageAttribute<CashAccountAuditTrailReport1, CashAccount16>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountAuditTrailReport1.mmObject();
			isDerived = false;
			xmlTag = "CshAcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccountIdentification";
			definition = "Identifies the cash account for which the audit trail is provided.";
			nextVersions_lazy = () -> Arrays.asList(CashAccountAuditTrailReport2.mmCashAccountIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CashAccount16.mmObject();
		}

		@Override
		public CashAccount16 getValue(CashAccountAuditTrailReport1 obj) {
			return obj.getCashAccountIdentification();
		}

		@Override
		public void setValue(CashAccountAuditTrailReport1 obj, CashAccount16 value) {
			obj.setCashAccountIdentification(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccountAuditTrailReport1.mmCashAccountAuditTrailOrError, com.tools20022.repository.msg.CashAccountAuditTrailReport1.mmDatePeriod,
						com.tools20022.repository.msg.CashAccountAuditTrailReport1.mmCashAccountIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CashAccountAuditTrailReport1";
				definition = "Report information about cash account reference data.";
				nextVersions_lazy = () -> Arrays.asList(CashAccountAuditTrailReport2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public AuditTrailOrBusinessError1Choice getCashAccountAuditTrailOrError() {
		return cashAccountAuditTrailOrError;
	}

	public CashAccountAuditTrailReport1 setCashAccountAuditTrailOrError(AuditTrailOrBusinessError1Choice cashAccountAuditTrailOrError) {
		this.cashAccountAuditTrailOrError = Objects.requireNonNull(cashAccountAuditTrailOrError);
		return this;
	}

	public Optional<DateSearchChoice> getDatePeriod() {
		return datePeriod == null ? Optional.empty() : Optional.of(datePeriod);
	}

	public CashAccountAuditTrailReport1 setDatePeriod(DateSearchChoice datePeriod) {
		this.datePeriod = datePeriod;
		return this;
	}

	public CashAccount16 getCashAccountIdentification() {
		return cashAccountIdentification;
	}

	public CashAccountAuditTrailReport1 setCashAccountIdentification(CashAccount16 cashAccountIdentification) {
		this.cashAccountIdentification = Objects.requireNonNull(cashAccountIdentification);
		return this;
	}
}