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
import com.tools20022.repository.codeset.UnderlyingProductIdentifierCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates the underlying product type for reporting to trade repositories.
 * These product codes must be in line with the ISDA Product Taxonomy.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingProductIdentifierCode#ForeignExchangeForward
 * UnderlyingProductIdentifierCode.ForeignExchangeForward}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingProductIdentifierCode#ForeignExchangeNonDeliverableForward
 * UnderlyingProductIdentifierCode.ForeignExchangeNonDeliverableForward}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingProductIdentifierCode#ForeignExchangeSpot
 * UnderlyingProductIdentifierCode.ForeignExchangeSpot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingProductIdentifierCode#ForeignExchangeSWAP
 * UnderlyingProductIdentifierCode.ForeignExchangeSWAP}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingProductIdentifier1Code
 * UnderlyingProductIdentifier1Code}</li>
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
 * <li>"FORW"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnderlyingProductIdentifierCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates the underlying product type for reporting to trade repositories. These product codes must be in line with the ISDA Product Taxonomy."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UnderlyingProductIdentifierCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Underlying product type of the transaction is a Foreign Exchange Forward.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingProductIdentifierCode
	 * UnderlyingProductIdentifierCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FORW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeForward"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Underlying product type of the transaction is a Foreign Exchange Forward."
	 * </li>
	 * </ul>
	 */
	public static final UnderlyingProductIdentifierCode ForeignExchangeForward = new UnderlyingProductIdentifierCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeForward";
			definition = "Underlying product type of the transaction is a Foreign Exchange Forward.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingProductIdentifierCode.mmObject();
			codeName = "FORW";
		}
	};
	/**
	 * Underlying product type of the transaction is a Foreign Exchange Non
	 * Deliverable Forward.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingProductIdentifierCode
	 * UnderlyingProductIdentifierCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NDFO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeNonDeliverableForward"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Underlying product type of the transaction is a Foreign Exchange Non Deliverable Forward."
	 * </li>
	 * </ul>
	 */
	public static final UnderlyingProductIdentifierCode ForeignExchangeNonDeliverableForward = new UnderlyingProductIdentifierCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeNonDeliverableForward";
			definition = "Underlying product type of the transaction is a Foreign Exchange Non Deliverable Forward.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingProductIdentifierCode.mmObject();
			codeName = "NDFO";
		}
	};
	/**
	 * Underlying product type of the transaction is Foreign Exchange Spot.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingProductIdentifierCode
	 * UnderlyingProductIdentifierCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPOT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeSpot"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Underlying product type of the transaction is Foreign Exchange Spot."</li>
	 * </ul>
	 */
	public static final UnderlyingProductIdentifierCode ForeignExchangeSpot = new UnderlyingProductIdentifierCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeSpot";
			definition = "Underlying product type of the transaction is Foreign Exchange Spot.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingProductIdentifierCode.mmObject();
			codeName = "SPOT";
		}
	};
	/**
	 * Underlying product type of the transaction is a Foreign Exchange SWAP.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingProductIdentifierCode
	 * UnderlyingProductIdentifierCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SWAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeSWAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Underlying product type of the transaction is a Foreign Exchange SWAP."</li>
	 * </ul>
	 */
	public static final UnderlyingProductIdentifierCode ForeignExchangeSWAP = new UnderlyingProductIdentifierCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeSWAP";
			definition = "Underlying product type of the transaction is a Foreign Exchange SWAP.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingProductIdentifierCode.mmObject();
			codeName = "SWAP";
		}
	};
	final static private LinkedHashMap<String, UnderlyingProductIdentifierCode> codesByName = new LinkedHashMap<>();

	protected UnderlyingProductIdentifierCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("FORW");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnderlyingProductIdentifierCode";
				definition = "Indicates the underlying product type for reporting to trade repositories. These product codes must be in line with the ISDA Product Taxonomy.";
				derivation_lazy = () -> Arrays.asList(UnderlyingProductIdentifier1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UnderlyingProductIdentifierCode.ForeignExchangeForward,
						com.tools20022.repository.codeset.UnderlyingProductIdentifierCode.ForeignExchangeNonDeliverableForward, com.tools20022.repository.codeset.UnderlyingProductIdentifierCode.ForeignExchangeSpot,
						com.tools20022.repository.codeset.UnderlyingProductIdentifierCode.ForeignExchangeSWAP);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ForeignExchangeForward.getCodeName().get(), ForeignExchangeForward);
		codesByName.put(ForeignExchangeNonDeliverableForward.getCodeName().get(), ForeignExchangeNonDeliverableForward);
		codesByName.put(ForeignExchangeSpot.getCodeName().get(), ForeignExchangeSpot);
		codesByName.put(ForeignExchangeSWAP.getCodeName().get(), ForeignExchangeSWAP);
	}

	public static UnderlyingProductIdentifierCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UnderlyingProductIdentifierCode[] values() {
		UnderlyingProductIdentifierCode[] values = new UnderlyingProductIdentifierCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UnderlyingProductIdentifierCode> {
		@Override
		public UnderlyingProductIdentifierCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UnderlyingProductIdentifierCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}