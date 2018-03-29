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

import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.ReportingTransactionType1Choice;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.SecuritiesTrade;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SecuritiesTransaction1;
import com.tools20022.repository.msg.SecuritiesTransactionReport2;
import com.tools20022.repository.msg.SecuritiesTransactionReport4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Exchange of securities.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesTransaction"
 * src="doc-files/SecuritiesTransaction.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
 * SecuritiesTrade}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransaction#mmReplacedAmount
 * SecuritiesTransaction.mmReplacedAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReportingTransactionType1Choice#mmNew
 * ReportingTransactionType1Choice.mmNew}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReportingTransactionType1Choice#mmCancellation
 * ReportingTransactionType1Choice.mmCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4#mmTransaction
 * SecuritiesTransactionReport4.mmTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTransaction1
 * SecuritiesTransaction1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport2
 * SecuritiesTransactionReport2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4
 * SecuritiesTransactionReport4}</li>
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
 * "SecuritiesTransaction"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Exchange of securities."</li>
 * </ul>
 */
public class SecuritiesTransaction extends SecuritiesTrade {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyAndAmount replacedAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransaction
	 * SecuritiesTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReplacedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the amount requested to be replaced or actually replaced."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTransaction, CurrencyAndAmount> mmReplacedAmount = new MMBusinessAttribute<SecuritiesTransaction, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReplacedAmount";
			definition = "Specifies the amount requested to be replaced or actually replaced.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(SecuritiesTransaction obj) {
			return obj.getReplacedAmount();
		}

		@Override
		public void setValue(SecuritiesTransaction obj, CurrencyAndAmount value) {
			obj.setReplacedAmount(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTransaction";
				definition = "Exchange of securities.";
				derivationElement_lazy = () -> Arrays.asList(ReportingTransactionType1Choice.mmNew, ReportingTransactionType1Choice.mmCancellation, SecuritiesTransactionReport4.mmTransaction);
				superType_lazy = () -> SecuritiesTrade.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTransaction.mmReplacedAmount);
				derivationComponent_lazy = () -> Arrays.asList(SecuritiesTransaction1.mmObject(), SecuritiesTransactionReport2.mmObject(), SecuritiesTransactionReport4.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesTransaction.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getReplacedAmount() {
		return replacedAmount;
	}

	public SecuritiesTransaction setReplacedAmount(CurrencyAndAmount replacedAmount) {
		this.replacedAmount = Objects.requireNonNull(replacedAmount);
		return this;
	}
}