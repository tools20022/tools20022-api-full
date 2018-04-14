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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.DeliveryReceiptType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies how the transaction is to be settled.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeliveryReceiptType1Code#Free
 * DeliveryReceiptType1Code.Free}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeliveryReceiptType1Code#AgainstPayment
 * DeliveryReceiptType1Code.AgainstPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeliveryReceiptType1Code#SplitFromPayment
 * DeliveryReceiptType1Code.SplitFromPayment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DeliveryReceiptType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies how the transaction is to be settled."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"FREE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DeliveryReceiptType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Settled free of payment. The securities movement is a result of an
	 * in-kind transaction or a custodial bank move.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryReceiptType1Code
	 * DeliveryReceiptType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FREE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Free"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settled free of payment. The securities movement is a result of an in-kind transaction or a custodial bank move."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22::PAYM//FREE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final DeliveryReceiptType1Code Free = new DeliveryReceiptType1Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22::PAYM//FREE"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Free";
			definition = "Settled free of payment. The securities movement is a result of an in-kind transaction or a custodial bank move.";
			owner_lazy = () -> com.tools20022.repository.codeset.DeliveryReceiptType1Code.mmObject();
			codeName = "FREE";
		}
	};
	/**
	 * Settled against payment. Delivery or receipt is against payment, ie, DVP
	 * or RVP.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryReceiptType1Code
	 * DeliveryReceiptType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "APMT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgainstPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settled against payment. Delivery or receipt is against payment, ie, DVP or RVP."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22::PAYM//APMT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final DeliveryReceiptType1Code AgainstPayment = new DeliveryReceiptType1Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22::PAYM//APMT"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AgainstPayment";
			definition = "Settled against payment. Delivery or receipt is against payment, ie, DVP or RVP.";
			owner_lazy = () -> com.tools20022.repository.codeset.DeliveryReceiptType1Code.mmObject();
			codeName = "APMT";
		}
	};
	/**
	 * Settled separate from payment. Delivery or receipt is free, with a
	 * separate payment arrangement, eg, a separate cash instruction from the
	 * buy side.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryReceiptType1Code
	 * DeliveryReceiptType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DSPA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SplitFromPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settled separate from payment. Delivery or receipt is free, with a separate payment arrangement, eg, a separate cash instruction from the buy side."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final DeliveryReceiptType1Code SplitFromPayment = new DeliveryReceiptType1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SplitFromPayment";
			definition = "Settled separate from payment. Delivery or receipt is free, with a separate payment arrangement, eg, a separate cash instruction from the buy side.";
			owner_lazy = () -> com.tools20022.repository.codeset.DeliveryReceiptType1Code.mmObject();
			codeName = "DSPA";
		}
	};
	final static private LinkedHashMap<String, DeliveryReceiptType1Code> codesByName = new LinkedHashMap<>();

	protected DeliveryReceiptType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("FREE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DeliveryReceiptType1Code";
				definition = "Specifies how the transaction is to be settled.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DeliveryReceiptType1Code.Free, com.tools20022.repository.codeset.DeliveryReceiptType1Code.AgainstPayment,
						com.tools20022.repository.codeset.DeliveryReceiptType1Code.SplitFromPayment);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Free.getCodeName().get(), Free);
		codesByName.put(AgainstPayment.getCodeName().get(), AgainstPayment);
		codesByName.put(SplitFromPayment.getCodeName().get(), SplitFromPayment);
	}

	public static DeliveryReceiptType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DeliveryReceiptType1Code[] values() {
		DeliveryReceiptType1Code[] values = new DeliveryReceiptType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DeliveryReceiptType1Code> {
		@Override
		public DeliveryReceiptType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DeliveryReceiptType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}