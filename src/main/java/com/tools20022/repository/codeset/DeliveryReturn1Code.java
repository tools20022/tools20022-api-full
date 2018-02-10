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
import com.tools20022.repository.codeset.DeliveryReturn1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of delivery return.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeliveryReturn1Code#UnrecognisedDelivery
 * DeliveryReturn1Code.UnrecognisedDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeliveryReturn1Code#WrongQuantity
 * DeliveryReturn1Code.WrongQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeliveryReturn1Code#WrongSettlementAmount
 * DeliveryReturn1Code.WrongSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeliveryReturn1Code#PartialDelivery
 * DeliveryReturn1Code.PartialDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeliveryReturn1Code#AccountMissing
 * DeliveryReturn1Code.AccountMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeliveryReturn1Code#DueBiillMissing
 * DeliveryReturn1Code.DueBiillMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeliveryReturn1Code#PartialReturn
 * DeliveryReturn1Code.PartialReturn}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DeliveryReturnCode
 * DeliveryReturnCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"UNRE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DeliveryReturn1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of delivery return."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DeliveryReturn1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryReturn1Code
	 * DeliveryReturn1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnrecognisedDelivery"</li>
	 * </ul>
	 */
	public static final DeliveryReturn1Code UnrecognisedDelivery = new DeliveryReturn1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnrecognisedDelivery";
			owner_lazy = () -> com.tools20022.repository.codeset.DeliveryReturn1Code.mmObject();
			codeName = DeliveryReturnCode.UnrecognisedDelivery.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryReturn1Code
	 * DeliveryReturn1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrongQuantity"</li>
	 * </ul>
	 */
	public static final DeliveryReturn1Code WrongQuantity = new DeliveryReturn1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongQuantity";
			owner_lazy = () -> com.tools20022.repository.codeset.DeliveryReturn1Code.mmObject();
			codeName = DeliveryReturnCode.WrongQuantity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryReturn1Code
	 * DeliveryReturn1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrongSettlementAmount"</li>
	 * </ul>
	 */
	public static final DeliveryReturn1Code WrongSettlementAmount = new DeliveryReturn1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongSettlementAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.DeliveryReturn1Code.mmObject();
			codeName = DeliveryReturnCode.WrongSettlementAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryReturn1Code
	 * DeliveryReturn1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialDelivery"</li>
	 * </ul>
	 */
	public static final DeliveryReturn1Code PartialDelivery = new DeliveryReturn1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialDelivery";
			owner_lazy = () -> com.tools20022.repository.codeset.DeliveryReturn1Code.mmObject();
			codeName = DeliveryReturnCode.PartialDelivery.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryReturn1Code
	 * DeliveryReturn1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountMissing"</li>
	 * </ul>
	 */
	public static final DeliveryReturn1Code AccountMissing = new DeliveryReturn1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountMissing";
			owner_lazy = () -> com.tools20022.repository.codeset.DeliveryReturn1Code.mmObject();
			codeName = DeliveryReturnCode.AccountMissing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryReturn1Code
	 * DeliveryReturn1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DueBiillMissing"</li>
	 * </ul>
	 */
	public static final DeliveryReturn1Code DueBiillMissing = new DeliveryReturn1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DueBiillMissing";
			owner_lazy = () -> com.tools20022.repository.codeset.DeliveryReturn1Code.mmObject();
			codeName = DeliveryReturnCode.DueBiillMissing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryReturn1Code
	 * DeliveryReturn1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialReturn"</li>
	 * </ul>
	 */
	public static final DeliveryReturn1Code PartialReturn = new DeliveryReturn1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialReturn";
			owner_lazy = () -> com.tools20022.repository.codeset.DeliveryReturn1Code.mmObject();
			codeName = DeliveryReturnCode.PartialReturn.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DeliveryReturn1Code> codesByName = new LinkedHashMap<>();

	protected DeliveryReturn1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("UNRE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DeliveryReturn1Code";
				definition = "Specifies the type of delivery return.";
				trace_lazy = () -> DeliveryReturnCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DeliveryReturn1Code.UnrecognisedDelivery, com.tools20022.repository.codeset.DeliveryReturn1Code.WrongQuantity,
						com.tools20022.repository.codeset.DeliveryReturn1Code.WrongSettlementAmount, com.tools20022.repository.codeset.DeliveryReturn1Code.PartialDelivery,
						com.tools20022.repository.codeset.DeliveryReturn1Code.AccountMissing, com.tools20022.repository.codeset.DeliveryReturn1Code.DueBiillMissing, com.tools20022.repository.codeset.DeliveryReturn1Code.PartialReturn);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(UnrecognisedDelivery.getCodeName().get(), UnrecognisedDelivery);
		codesByName.put(WrongQuantity.getCodeName().get(), WrongQuantity);
		codesByName.put(WrongSettlementAmount.getCodeName().get(), WrongSettlementAmount);
		codesByName.put(PartialDelivery.getCodeName().get(), PartialDelivery);
		codesByName.put(AccountMissing.getCodeName().get(), AccountMissing);
		codesByName.put(DueBiillMissing.getCodeName().get(), DueBiillMissing);
		codesByName.put(PartialReturn.getCodeName().get(), PartialReturn);
	}

	public static DeliveryReturn1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DeliveryReturn1Code[] values() {
		DeliveryReturn1Code[] values = new DeliveryReturn1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DeliveryReturn1Code> {
		@Override
		public DeliveryReturn1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DeliveryReturn1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}