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
import com.tools20022.repository.codeset.DeliveryTypeV2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Describes the delivery or custody arrangement for the underlying securities.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeliveryTypeV2Code#AgainstPayment
 * DeliveryTypeV2Code.AgainstPayment}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DeliveryTypeV2Code#Free
 * DeliveryTypeV2Code.Free}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeliveryTypeV2Code#Triparty
 * DeliveryTypeV2Code.Triparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeliveryTypeV2Code#HoldInCustody
 * DeliveryTypeV2Code.HoldInCustody}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DeliveryType2Code
 * DeliveryType2Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"APMT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DeliveryTypeV2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Describes the delivery or custody arrangement for the underlying securities."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DeliveryTypeV2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates that the delivery is against payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryTypeV2Code
	 * DeliveryTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "APMT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgainstPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that the delivery is against payment."</li>
	 * </ul>
	 */
	public static final DeliveryTypeV2Code AgainstPayment = new DeliveryTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgainstPayment";
			definition = "Indicates that the delivery is against payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DeliveryTypeV2Code.mmObject();
			codeName = "APMT";
		}
	};
	/**
	 * Indicates the delivery is free of payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryTypeV2Code
	 * DeliveryTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FREE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Free"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the delivery is free of payment."</li>
	 * </ul>
	 */
	public static final DeliveryTypeV2Code Free = new DeliveryTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Free";
			definition = "Indicates the delivery is free of payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DeliveryTypeV2Code.mmObject();
			codeName = "FREE";
		}
	};
	/**
	 * Indicates that a custodian bank or international clearing organization
	 * acts as an intermediary between the two parties to the repo.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryTypeV2Code
	 * DeliveryTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRIP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Triparty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that a custodian bank or international clearing organization acts as an intermediary between the two parties to the repo."
	 * </li>
	 * </ul>
	 */
	public static final DeliveryTypeV2Code Triparty = new DeliveryTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Triparty";
			definition = "Indicates that a custodian bank or international clearing organization acts as an intermediary between the two parties to the repo.";
			owner_lazy = () -> com.tools20022.repository.codeset.DeliveryTypeV2Code.mmObject();
			codeName = "TRIP";
		}
	};
	/**
	 * Indicates that the collateral pledged by the (cash) borrower is not
	 * actually delivered to the cash lender. Rather, it is placed in an
	 * internal account ("held in custody") by the borrower, for the lender,
	 * throughout the duration of the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryTypeV2Code
	 * DeliveryTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HOIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldInCustody"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the collateral pledged by the (cash) borrower is not actually delivered to the cash lender. Rather, it is placed in an internal account (\"held in custody\") by the borrower, for the lender, throughout the duration of the trade."
	 * </li>
	 * </ul>
	 */
	public static final DeliveryTypeV2Code HoldInCustody = new DeliveryTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldInCustody";
			definition = "Indicates that the collateral pledged by the (cash) borrower is not actually delivered to the cash lender. Rather, it is placed in an internal account (\"held in custody\") by the borrower, for the lender, throughout the duration of the trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.DeliveryTypeV2Code.mmObject();
			codeName = "HOIC";
		}
	};
	final static private LinkedHashMap<String, DeliveryTypeV2Code> codesByName = new LinkedHashMap<>();

	protected DeliveryTypeV2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("APMT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DeliveryTypeV2Code";
				definition = "Describes the delivery or custody arrangement for the underlying securities.";
				derivation_lazy = () -> Arrays.asList(DeliveryType2Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DeliveryTypeV2Code.AgainstPayment, com.tools20022.repository.codeset.DeliveryTypeV2Code.Free, com.tools20022.repository.codeset.DeliveryTypeV2Code.Triparty,
						com.tools20022.repository.codeset.DeliveryTypeV2Code.HoldInCustody);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AgainstPayment.getCodeName().get(), AgainstPayment);
		codesByName.put(Free.getCodeName().get(), Free);
		codesByName.put(Triparty.getCodeName().get(), Triparty);
		codesByName.put(HoldInCustody.getCodeName().get(), HoldInCustody);
	}

	public static DeliveryTypeV2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DeliveryTypeV2Code[] values() {
		DeliveryTypeV2Code[] values = new DeliveryTypeV2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DeliveryTypeV2Code> {
		@Override
		public DeliveryTypeV2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DeliveryTypeV2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}