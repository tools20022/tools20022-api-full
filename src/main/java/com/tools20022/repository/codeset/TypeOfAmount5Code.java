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
import com.tools20022.repository.codeset.TypeOfAmount5Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type or class of amount.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfAmount5Code#Cashback
 * TypeOfAmount5Code.Cashback}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfAmount5Code#Discount
 * TypeOfAmount5Code.Discount}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfAmount5Code#Fees
 * TypeOfAmount5Code.Fees}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfAmount5Code#Gratuity
 * TypeOfAmount5Code.Gratuity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount5Code#Surcharge
 * TypeOfAmount5Code.Surcharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount5Code#ValueAddedTax
 * TypeOfAmount5Code.ValueAddedTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount5Code#Commission
 * TypeOfAmount5Code.Commission}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfAmount5Code#Donation
 * TypeOfAmount5Code.Donation}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfAmount5Code#Tax
 * TypeOfAmount5Code.Tax}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode
 * TypeOfAmountCode}</li>
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
 * "TypeOfAmount5Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type or class of amount."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TypeOfAmount5Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount5Code
	 * TypeOfAmount5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cashback"</li>
	 * </ul>
	 */
	public static final TypeOfAmount5Code Cashback = new TypeOfAmount5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cashback";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfAmount5Code.mmObject();
			codeName = TypeOfAmountCode.Cashback.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount5Code
	 * TypeOfAmount5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Discount"</li>
	 * </ul>
	 */
	public static final TypeOfAmount5Code Discount = new TypeOfAmount5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Discount";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfAmount5Code.mmObject();
			codeName = TypeOfAmountCode.Discount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount5Code
	 * TypeOfAmount5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fees"</li>
	 * </ul>
	 */
	public static final TypeOfAmount5Code Fees = new TypeOfAmount5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fees";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfAmount5Code.mmObject();
			codeName = TypeOfAmountCode.Fees.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount5Code
	 * TypeOfAmount5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gratuity"</li>
	 * </ul>
	 */
	public static final TypeOfAmount5Code Gratuity = new TypeOfAmount5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Gratuity";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfAmount5Code.mmObject();
			codeName = TypeOfAmountCode.Gratuity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount5Code
	 * TypeOfAmount5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Surcharge"</li>
	 * </ul>
	 */
	public static final TypeOfAmount5Code Surcharge = new TypeOfAmount5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Surcharge";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfAmount5Code.mmObject();
			codeName = TypeOfAmountCode.Surcharge.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount5Code
	 * TypeOfAmount5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueAddedTax"</li>
	 * </ul>
	 */
	public static final TypeOfAmount5Code ValueAddedTax = new TypeOfAmount5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueAddedTax";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfAmount5Code.mmObject();
			codeName = TypeOfAmountCode.ValueAddedTax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount5Code
	 * TypeOfAmount5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commission"</li>
	 * </ul>
	 */
	public static final TypeOfAmount5Code Commission = new TypeOfAmount5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commission";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfAmount5Code.mmObject();
			codeName = TypeOfAmountCode.Commission.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount5Code
	 * TypeOfAmount5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Donation"</li>
	 * </ul>
	 */
	public static final TypeOfAmount5Code Donation = new TypeOfAmount5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Donation";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfAmount5Code.mmObject();
			codeName = TypeOfAmountCode.Donation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount5Code
	 * TypeOfAmount5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * </ul>
	 */
	public static final TypeOfAmount5Code Tax = new TypeOfAmount5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tax";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfAmount5Code.mmObject();
			codeName = TypeOfAmountCode.Tax.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TypeOfAmount5Code> codesByName = new LinkedHashMap<>();

	protected TypeOfAmount5Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TypeOfAmount5Code";
				definition = "Type or class of amount.";
				trace_lazy = () -> TypeOfAmountCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TypeOfAmount5Code.Cashback, com.tools20022.repository.codeset.TypeOfAmount5Code.Discount, com.tools20022.repository.codeset.TypeOfAmount5Code.Fees,
						com.tools20022.repository.codeset.TypeOfAmount5Code.Gratuity, com.tools20022.repository.codeset.TypeOfAmount5Code.Surcharge, com.tools20022.repository.codeset.TypeOfAmount5Code.ValueAddedTax,
						com.tools20022.repository.codeset.TypeOfAmount5Code.Commission, com.tools20022.repository.codeset.TypeOfAmount5Code.Donation, com.tools20022.repository.codeset.TypeOfAmount5Code.Tax);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Cashback.getCodeName().get(), Cashback);
		codesByName.put(Discount.getCodeName().get(), Discount);
		codesByName.put(Fees.getCodeName().get(), Fees);
		codesByName.put(Gratuity.getCodeName().get(), Gratuity);
		codesByName.put(Surcharge.getCodeName().get(), Surcharge);
		codesByName.put(ValueAddedTax.getCodeName().get(), ValueAddedTax);
		codesByName.put(Commission.getCodeName().get(), Commission);
		codesByName.put(Donation.getCodeName().get(), Donation);
		codesByName.put(Tax.getCodeName().get(), Tax);
	}

	public static TypeOfAmount5Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TypeOfAmount5Code[] values() {
		TypeOfAmount5Code[] values = new TypeOfAmount5Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TypeOfAmount5Code> {
		@Override
		public TypeOfAmount5Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TypeOfAmount5Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}