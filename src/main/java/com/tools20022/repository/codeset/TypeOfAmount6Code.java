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
import com.tools20022.repository.codeset.TypeOfAmount6Code.InternalXmlAdapter;
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
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount6Code#ATMCommissionFee
 * TypeOfAmount6Code.ATMCommissionFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount6Code#AuthorisedAmount
 * TypeOfAmount6Code.AuthorisedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount6Code#CardRemainingBalance
 * TypeOfAmount6Code.CardRemainingBalance}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfAmount6Code#Discount
 * TypeOfAmount6Code.Discount}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfAmount6Code#Fees
 * TypeOfAmount6Code.Fees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount6Code#MaximumAllowedAmount
 * TypeOfAmount6Code.MaximumAllowedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount6Code#MinimumAllowedAmount
 * TypeOfAmount6Code.MinimumAllowedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount6Code#RequestedAmount
 * TypeOfAmount6Code.RequestedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount6Code#Surcharge
 * TypeOfAmount6Code.Surcharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount6Code#ValueAddedTax
 * TypeOfAmount6Code.ValueAddedTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount6Code#IssuerCommission
 * TypeOfAmount6Code.IssuerCommission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount6Code#IssuerFees
 * TypeOfAmount6Code.IssuerFees}</li>
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
 * "TypeOfAmount6Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type or class of amount."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TypeOfAmount6Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount6Code
	 * TypeOfAmount6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMCommissionFee"</li>
	 * </ul>
	 */
	public static final TypeOfAmount6Code ATMCommissionFee = new TypeOfAmount6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMCommissionFee";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfAmount6Code.mmObject();
			codeName = TypeOfAmountCode.ATMCommissionFee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount6Code
	 * TypeOfAmount6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisedAmount"</li>
	 * </ul>
	 */
	public static final TypeOfAmount6Code AuthorisedAmount = new TypeOfAmount6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisedAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfAmount6Code.mmObject();
			codeName = TypeOfAmountCode.AuthorisedAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount6Code
	 * TypeOfAmount6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardRemainingBalance"</li>
	 * </ul>
	 */
	public static final TypeOfAmount6Code CardRemainingBalance = new TypeOfAmount6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardRemainingBalance";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfAmount6Code.mmObject();
			codeName = TypeOfAmountCode.CardRemainingBalance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount6Code
	 * TypeOfAmount6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Discount"</li>
	 * </ul>
	 */
	public static final TypeOfAmount6Code Discount = new TypeOfAmount6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Discount";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfAmount6Code.mmObject();
			codeName = TypeOfAmountCode.Discount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount6Code
	 * TypeOfAmount6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fees"</li>
	 * </ul>
	 */
	public static final TypeOfAmount6Code Fees = new TypeOfAmount6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fees";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfAmount6Code.mmObject();
			codeName = TypeOfAmountCode.Fees.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount6Code
	 * TypeOfAmount6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumAllowedAmount"</li>
	 * </ul>
	 */
	public static final TypeOfAmount6Code MaximumAllowedAmount = new TypeOfAmount6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumAllowedAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfAmount6Code.mmObject();
			codeName = TypeOfAmountCode.MaximumAllowedAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount6Code
	 * TypeOfAmount6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumAllowedAmount"</li>
	 * </ul>
	 */
	public static final TypeOfAmount6Code MinimumAllowedAmount = new TypeOfAmount6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumAllowedAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfAmount6Code.mmObject();
			codeName = TypeOfAmountCode.MinimumAllowedAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount6Code
	 * TypeOfAmount6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedAmount"</li>
	 * </ul>
	 */
	public static final TypeOfAmount6Code RequestedAmount = new TypeOfAmount6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfAmount6Code.mmObject();
			codeName = TypeOfAmountCode.RequestedAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount6Code
	 * TypeOfAmount6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Surcharge"</li>
	 * </ul>
	 */
	public static final TypeOfAmount6Code Surcharge = new TypeOfAmount6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Surcharge";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfAmount6Code.mmObject();
			codeName = TypeOfAmountCode.Surcharge.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount6Code
	 * TypeOfAmount6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueAddedTax"</li>
	 * </ul>
	 */
	public static final TypeOfAmount6Code ValueAddedTax = new TypeOfAmount6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueAddedTax";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfAmount6Code.mmObject();
			codeName = TypeOfAmountCode.ValueAddedTax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount6Code
	 * TypeOfAmount6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerCommission"</li>
	 * </ul>
	 */
	public static final TypeOfAmount6Code IssuerCommission = new TypeOfAmount6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerCommission";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfAmount6Code.mmObject();
			codeName = TypeOfAmountCode.IssuerCommission.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount6Code
	 * TypeOfAmount6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerFees"</li>
	 * </ul>
	 */
	public static final TypeOfAmount6Code IssuerFees = new TypeOfAmount6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerFees";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfAmount6Code.mmObject();
			codeName = TypeOfAmountCode.IssuerFees.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TypeOfAmount6Code> codesByName = new LinkedHashMap<>();

	protected TypeOfAmount6Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TypeOfAmount6Code";
				definition = "Type or class of amount.";
				trace_lazy = () -> TypeOfAmountCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TypeOfAmount6Code.ATMCommissionFee, com.tools20022.repository.codeset.TypeOfAmount6Code.AuthorisedAmount,
						com.tools20022.repository.codeset.TypeOfAmount6Code.CardRemainingBalance, com.tools20022.repository.codeset.TypeOfAmount6Code.Discount, com.tools20022.repository.codeset.TypeOfAmount6Code.Fees,
						com.tools20022.repository.codeset.TypeOfAmount6Code.MaximumAllowedAmount, com.tools20022.repository.codeset.TypeOfAmount6Code.MinimumAllowedAmount,
						com.tools20022.repository.codeset.TypeOfAmount6Code.RequestedAmount, com.tools20022.repository.codeset.TypeOfAmount6Code.Surcharge, com.tools20022.repository.codeset.TypeOfAmount6Code.ValueAddedTax,
						com.tools20022.repository.codeset.TypeOfAmount6Code.IssuerCommission, com.tools20022.repository.codeset.TypeOfAmount6Code.IssuerFees);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ATMCommissionFee.getCodeName().get(), ATMCommissionFee);
		codesByName.put(AuthorisedAmount.getCodeName().get(), AuthorisedAmount);
		codesByName.put(CardRemainingBalance.getCodeName().get(), CardRemainingBalance);
		codesByName.put(Discount.getCodeName().get(), Discount);
		codesByName.put(Fees.getCodeName().get(), Fees);
		codesByName.put(MaximumAllowedAmount.getCodeName().get(), MaximumAllowedAmount);
		codesByName.put(MinimumAllowedAmount.getCodeName().get(), MinimumAllowedAmount);
		codesByName.put(RequestedAmount.getCodeName().get(), RequestedAmount);
		codesByName.put(Surcharge.getCodeName().get(), Surcharge);
		codesByName.put(ValueAddedTax.getCodeName().get(), ValueAddedTax);
		codesByName.put(IssuerCommission.getCodeName().get(), IssuerCommission);
		codesByName.put(IssuerFees.getCodeName().get(), IssuerFees);
	}

	public static TypeOfAmount6Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TypeOfAmount6Code[] values() {
		TypeOfAmount6Code[] values = new TypeOfAmount6Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TypeOfAmount6Code> {
		@Override
		public TypeOfAmount6Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TypeOfAmount6Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}