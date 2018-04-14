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
import com.tools20022.repository.codeset.TaxRecordCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.TaxRecordCode#WithholdingTax
 * TaxRecordCode.WithholdingTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordCode#ValueAddedTax
 * TaxRecordCode.ValueAddedTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordCode#IncomePaymentDetails
 * TaxRecordCode.IncomePaymentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordCode#TotalAmountForIncomePayments
 * TaxRecordCode.TotalAmountForIncomePayments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordCode#MoneyPaymentDetails
 * TaxRecordCode.MoneyPaymentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxRecordCode#TotalAmountForMoneyPayments
 * TaxRecordCode.TotalAmountForMoneyPayments}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxRecordCode#Other
 * TaxRecordCode.Other}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxRecord1Code
 * TaxRecord1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TaxRecordCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of tax details."</li>
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
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TaxRecordCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Tax record is related to the withholding tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordCode
	 * TaxRecordCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WHTX"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax record is related to the withholding tax."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TaxRecordCode WithholdingTax = new TaxRecordCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTax";
			definition = "Tax record is related to the withholding tax.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecordCode.mmObject();
			codeName = "WHTX";
		}
	};
	/**
	 * Tax record is related to the value added tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordCode
	 * TaxRecordCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VATX"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueAddedTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax record is related to the value added tax."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TaxRecordCode ValueAddedTax = new TaxRecordCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueAddedTax";
			definition = "Tax record is related to the value added tax.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecordCode.mmObject();
			codeName = "VATX";
		}
	};
	/**
	 * Tax record is related to the income payment details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordCode
	 * TaxRecordCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INCP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomePaymentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax record is related to the income payment details."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TaxRecordCode IncomePaymentDetails = new TaxRecordCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomePaymentDetails";
			definition = "Tax record is related to the income payment details.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecordCode.mmObject();
			codeName = "INCP";
		}
	};
	/**
	 * Tax record is related to the total amount for income payments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordCode
	 * TaxRecordCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TLAI"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAmountForIncomePayments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax record is related to the total amount for income payments."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TaxRecordCode TotalAmountForIncomePayments = new TaxRecordCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAmountForIncomePayments";
			definition = "Tax record is related to the total amount for income payments.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecordCode.mmObject();
			codeName = "TLAI";
		}
	};
	/**
	 * Tax record is related to the money payments details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordCode
	 * TaxRecordCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MONP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoneyPaymentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax record is related to the money payments details."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TaxRecordCode MoneyPaymentDetails = new TaxRecordCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoneyPaymentDetails";
			definition = "Tax record is related to the money payments details.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecordCode.mmObject();
			codeName = "MONP";
		}
	};
	/**
	 * Tax record is related to the total amount for money payments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordCode
	 * TaxRecordCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TLAM"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAmountForMoneyPayments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax record is related to the total amount for money payments."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TaxRecordCode TotalAmountForMoneyPayments = new TaxRecordCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAmountForMoneyPayments";
			definition = "Tax record is related to the total amount for money payments.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecordCode.mmObject();
			codeName = "TLAM";
		}
	};
	/**
	 * Other tax record type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordCode
	 * TaxRecordCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other tax record type."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TaxRecordCode Other = new TaxRecordCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other tax record type.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxRecordCode.mmObject();
			codeName = "OTHR";
		}
	};
	final static private LinkedHashMap<String, TaxRecordCode> codesByName = new LinkedHashMap<>();

	protected TaxRecordCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("WHTX");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxRecordCode";
				definition = "Specifies the type of tax details.";
				derivation_lazy = () -> Arrays.asList(TaxRecord1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TaxRecordCode.WithholdingTax, com.tools20022.repository.codeset.TaxRecordCode.ValueAddedTax,
						com.tools20022.repository.codeset.TaxRecordCode.IncomePaymentDetails, com.tools20022.repository.codeset.TaxRecordCode.TotalAmountForIncomePayments,
						com.tools20022.repository.codeset.TaxRecordCode.MoneyPaymentDetails, com.tools20022.repository.codeset.TaxRecordCode.TotalAmountForMoneyPayments, com.tools20022.repository.codeset.TaxRecordCode.Other);
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

	public static TaxRecordCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TaxRecordCode[] values() {
		TaxRecordCode[] values = new TaxRecordCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TaxRecordCode> {
		@Override
		public TaxRecordCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TaxRecordCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}