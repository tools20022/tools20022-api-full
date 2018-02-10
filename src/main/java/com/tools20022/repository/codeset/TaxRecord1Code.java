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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.TaxRecord1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of tax details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecord1Code#WithholdingTax
 * TaxRecord1Code.WithholdingTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecord1Code#ValueAddedTax
 * TaxRecord1Code.ValueAddedTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecord1Code#IncomePaymentDetails
 * TaxRecord1Code.IncomePaymentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecord1Code#TotalAmountForIncomePayments
 * TaxRecord1Code.TotalAmountForIncomePayments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecord1Code#MoneyPaymentDetails
 * TaxRecord1Code.MoneyPaymentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecord1Code#TotalAmountForMoneyPayments
 * TaxRecord1Code.TotalAmountForMoneyPayments}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxRecord1Code#Other
 * TaxRecord1Code.Other}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TaxRecordCode TaxRecordCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"WHTX"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TaxRecord1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of tax details."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TaxRecord1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecord1Code
	 * TaxRecord1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTax"</li>
	 * </ul>
	 */
	public static final TaxRecord1Code WithholdingTax = new TaxRecord1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTax";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecord1Code.mmObject();
			codeName = TaxRecordCode.WithholdingTax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecord1Code
	 * TaxRecord1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueAddedTax"</li>
	 * </ul>
	 */
	public static final TaxRecord1Code ValueAddedTax = new TaxRecord1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueAddedTax";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecord1Code.mmObject();
			codeName = TaxRecordCode.ValueAddedTax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecord1Code
	 * TaxRecord1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomePaymentDetails"</li>
	 * </ul>
	 */
	public static final TaxRecord1Code IncomePaymentDetails = new TaxRecord1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomePaymentDetails";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecord1Code.mmObject();
			codeName = TaxRecordCode.IncomePaymentDetails.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecord1Code
	 * TaxRecord1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAmountForIncomePayments"</li>
	 * </ul>
	 */
	public static final TaxRecord1Code TotalAmountForIncomePayments = new TaxRecord1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAmountForIncomePayments";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecord1Code.mmObject();
			codeName = TaxRecordCode.TotalAmountForIncomePayments.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecord1Code
	 * TaxRecord1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoneyPaymentDetails"</li>
	 * </ul>
	 */
	public static final TaxRecord1Code MoneyPaymentDetails = new TaxRecord1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoneyPaymentDetails";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecord1Code.mmObject();
			codeName = TaxRecordCode.MoneyPaymentDetails.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecord1Code
	 * TaxRecord1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAmountForMoneyPayments"</li>
	 * </ul>
	 */
	public static final TaxRecord1Code TotalAmountForMoneyPayments = new TaxRecord1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAmountForMoneyPayments";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecord1Code.mmObject();
			codeName = TaxRecordCode.TotalAmountForMoneyPayments.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecord1Code
	 * TaxRecord1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final TaxRecord1Code Other = new TaxRecord1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecord1Code.mmObject();
			codeName = TaxRecordCode.Other.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TaxRecord1Code> codesByName = new LinkedHashMap<>();

	protected TaxRecord1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("WHTX");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxRecord1Code";
				definition = "Specifies the type of tax details.";
				trace_lazy = () -> TaxRecordCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TaxRecord1Code.WithholdingTax, com.tools20022.repository.codeset.TaxRecord1Code.ValueAddedTax,
						com.tools20022.repository.codeset.TaxRecord1Code.IncomePaymentDetails, com.tools20022.repository.codeset.TaxRecord1Code.TotalAmountForIncomePayments,
						com.tools20022.repository.codeset.TaxRecord1Code.MoneyPaymentDetails, com.tools20022.repository.codeset.TaxRecord1Code.TotalAmountForMoneyPayments, com.tools20022.repository.codeset.TaxRecord1Code.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(WithholdingTax.getCodeName().get(), WithholdingTax);
		codesByName.put(ValueAddedTax.getCodeName().get(), ValueAddedTax);
		codesByName.put(IncomePaymentDetails.getCodeName().get(), IncomePaymentDetails);
		codesByName.put(TotalAmountForIncomePayments.getCodeName().get(), TotalAmountForIncomePayments);
		codesByName.put(MoneyPaymentDetails.getCodeName().get(), MoneyPaymentDetails);
		codesByName.put(TotalAmountForMoneyPayments.getCodeName().get(), TotalAmountForMoneyPayments);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static TaxRecord1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TaxRecord1Code[] values() {
		TaxRecord1Code[] values = new TaxRecord1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TaxRecord1Code> {
		@Override
		public TaxRecord1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TaxRecord1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}