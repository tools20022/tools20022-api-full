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
import com.tools20022.repository.codeset.UnderlyingProductIdentifier1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.UnderlyingProductIdentifier1Code#ForeignExchangeForward
 * UnderlyingProductIdentifier1Code.ForeignExchangeForward}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingProductIdentifier1Code#ForeignExchangeNonDeliverableForward
 * UnderlyingProductIdentifier1Code.ForeignExchangeNonDeliverableForward}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingProductIdentifier1Code#ForeignExchangeSpot
 * UnderlyingProductIdentifier1Code.ForeignExchangeSpot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingProductIdentifier1Code#ForeignExchangeSWAP
 * UnderlyingProductIdentifier1Code.ForeignExchangeSWAP}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.UnderlyingProductIdentifierCode
 * UnderlyingProductIdentifierCode}</li>
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
 * "UnderlyingProductIdentifier1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates the underlying product type for reporting to trade repositories. These product codes must be in line with the ISDA Product Taxonomy."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UnderlyingProductIdentifier1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingProductIdentifier1Code
	 * UnderlyingProductIdentifier1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeForward"</li>
	 * </ul>
	 */
	public static final UnderlyingProductIdentifier1Code ForeignExchangeForward = new UnderlyingProductIdentifier1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeForward";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingProductIdentifier1Code.mmObject();
			codeName = UnderlyingProductIdentifierCode.ForeignExchangeForward.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingProductIdentifier1Code
	 * UnderlyingProductIdentifier1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeNonDeliverableForward"</li>
	 * </ul>
	 */
	public static final UnderlyingProductIdentifier1Code ForeignExchangeNonDeliverableForward = new UnderlyingProductIdentifier1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeNonDeliverableForward";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingProductIdentifier1Code.mmObject();
			codeName = UnderlyingProductIdentifierCode.ForeignExchangeNonDeliverableForward.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingProductIdentifier1Code
	 * UnderlyingProductIdentifier1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeSpot"</li>
	 * </ul>
	 */
	public static final UnderlyingProductIdentifier1Code ForeignExchangeSpot = new UnderlyingProductIdentifier1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeSpot";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingProductIdentifier1Code.mmObject();
			codeName = UnderlyingProductIdentifierCode.ForeignExchangeSpot.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingProductIdentifier1Code
	 * UnderlyingProductIdentifier1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeSWAP"</li>
	 * </ul>
	 */
	public static final UnderlyingProductIdentifier1Code ForeignExchangeSWAP = new UnderlyingProductIdentifier1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeSWAP";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingProductIdentifier1Code.mmObject();
			codeName = UnderlyingProductIdentifierCode.ForeignExchangeSWAP.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, UnderlyingProductIdentifier1Code> codesByName = new LinkedHashMap<>();

	protected UnderlyingProductIdentifier1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("FORW");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnderlyingProductIdentifier1Code";
				definition = "Indicates the underlying product type for reporting to trade repositories. These product codes must be in line with the ISDA Product Taxonomy.";
				trace_lazy = () -> UnderlyingProductIdentifierCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UnderlyingProductIdentifier1Code.ForeignExchangeForward,
						com.tools20022.repository.codeset.UnderlyingProductIdentifier1Code.ForeignExchangeNonDeliverableForward, com.tools20022.repository.codeset.UnderlyingProductIdentifier1Code.ForeignExchangeSpot,
						com.tools20022.repository.codeset.UnderlyingProductIdentifier1Code.ForeignExchangeSWAP);
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

	public static UnderlyingProductIdentifier1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UnderlyingProductIdentifier1Code[] values() {
		UnderlyingProductIdentifier1Code[] values = new UnderlyingProductIdentifier1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UnderlyingProductIdentifier1Code> {
		@Override
		public UnderlyingProductIdentifier1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UnderlyingProductIdentifier1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}