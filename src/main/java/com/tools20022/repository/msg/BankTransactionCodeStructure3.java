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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.ExternalBankTransactionFamilyCode;
import com.tools20022.repository.codeset.ExternalBankTransactionSubFamilyCode;
import com.tools20022.repository.entity.BankTransaction;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Code of the underlying bank transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BankTransactionCodeStructure3#mmCode
 * BankTransactionCodeStructure3.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BankTransactionCodeStructure3#mmSubFamilyCode
 * BankTransactionCodeStructure3.mmSubFamilyCode}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.BankTransaction
 * BankTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BankTransactionCodeStructure3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Code of the underlying bank transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BankTransactionCodeStructure3", propOrder = {"code", "subFamilyCode"})
public class BankTransactionCodeStructure3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Cd", required = true)
	protected ExternalBankTransactionFamilyCode code;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalBankTransactionFamilyCode
	 * ExternalBankTransactionFamilyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BankTransaction#mmFamily
	 * BankTransaction.mmFamily}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BankTransactionCodeStructure3
	 * BankTransactionCodeStructure3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Code"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the family within a domain."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BankTransactionCodeStructure3, ExternalBankTransactionFamilyCode> mmCode = new MMMessageAttribute<BankTransactionCodeStructure3, ExternalBankTransactionFamilyCode>() {
		{
			businessElementTrace_lazy = () -> BankTransaction.mmFamily;
			componentContext_lazy = () -> com.tools20022.repository.msg.BankTransactionCodeStructure3.mmObject();
			isDerived = false;
			xmlTag = "Cd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Code";
			definition = "Specifies the family within a domain.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalBankTransactionFamilyCode.mmObject();
		}

		@Override
		public ExternalBankTransactionFamilyCode getValue(BankTransactionCodeStructure3 obj) {
			return obj.getCode();
		}

		@Override
		public void setValue(BankTransactionCodeStructure3 obj, ExternalBankTransactionFamilyCode value) {
			obj.setCode(value);
		}
	};
	@XmlElement(name = "SubFmlyCd", required = true)
	protected ExternalBankTransactionSubFamilyCode subFamilyCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalBankTransactionSubFamilyCode
	 * ExternalBankTransactionSubFamilyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BankTransaction#mmSubFamily
	 * BankTransaction.mmSubFamily}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BankTransactionCodeStructure3
	 * BankTransactionCodeStructure3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubFmlyCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubFamilyCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the sub-product family within a specific family."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BankTransactionCodeStructure3, ExternalBankTransactionSubFamilyCode> mmSubFamilyCode = new MMMessageAttribute<BankTransactionCodeStructure3, ExternalBankTransactionSubFamilyCode>() {
		{
			businessElementTrace_lazy = () -> BankTransaction.mmSubFamily;
			componentContext_lazy = () -> com.tools20022.repository.msg.BankTransactionCodeStructure3.mmObject();
			isDerived = false;
			xmlTag = "SubFmlyCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubFamilyCode";
			definition = "Specifies the sub-product family within a specific family.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalBankTransactionSubFamilyCode.mmObject();
		}

		@Override
		public ExternalBankTransactionSubFamilyCode getValue(BankTransactionCodeStructure3 obj) {
			return obj.getSubFamilyCode();
		}

		@Override
		public void setValue(BankTransactionCodeStructure3 obj, ExternalBankTransactionSubFamilyCode value) {
			obj.setSubFamilyCode(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BankTransactionCodeStructure3.mmCode, com.tools20022.repository.msg.BankTransactionCodeStructure3.mmSubFamilyCode);
				trace_lazy = () -> BankTransaction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "BankTransactionCodeStructure3";
				definition = "Code of the underlying bank transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public ExternalBankTransactionFamilyCode getCode() {
		return code;
	}

	public BankTransactionCodeStructure3 setCode(ExternalBankTransactionFamilyCode code) {
		this.code = Objects.requireNonNull(code);
		return this;
	}

	public ExternalBankTransactionSubFamilyCode getSubFamilyCode() {
		return subFamilyCode;
	}

	public BankTransactionCodeStructure3 setSubFamilyCode(ExternalBankTransactionSubFamilyCode subFamilyCode) {
		this.subFamilyCode = Objects.requireNonNull(subFamilyCode);
		return this;
	}
}