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
import com.tools20022.repository.codeset.TriggerType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Defines when the trigger will hit, i.e. the action specified by the trigger
 * instructions will come into effect.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TriggerType1Code#PartialExecution
 * TriggerType1Code.PartialExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TriggerType1Code#SpecifiedTradingSession
 * TriggerType1Code.SpecifiedTradingSession}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TriggerType1Code#NextAuction
 * TriggerType1Code.NextAuction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TriggerType1Code#PriceMovement
 * TriggerType1Code.PriceMovement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TriggerTypeCode
 * TriggerTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TriggerType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines when the trigger will hit, i.e. the action specified by the trigger instructions will come into effect."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"PAEX"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TriggerType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TriggerType1Code
	 * TriggerType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TriggerType1Code PartialExecution = new TriggerType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialExecution";
			owner_lazy = () -> com.tools20022.repository.codeset.TriggerType1Code.mmObject();
			codeName = TriggerTypeCode.PartialExecution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TriggerType1Code
	 * TriggerType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecifiedTradingSession"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TriggerType1Code SpecifiedTradingSession = new TriggerType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecifiedTradingSession";
			owner_lazy = () -> com.tools20022.repository.codeset.TriggerType1Code.mmObject();
			codeName = TriggerTypeCode.SpecifiedTradingSession.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TriggerType1Code
	 * TriggerType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextAuction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TriggerType1Code NextAuction = new TriggerType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextAuction";
			owner_lazy = () -> com.tools20022.repository.codeset.TriggerType1Code.mmObject();
			codeName = TriggerTypeCode.NextAuction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TriggerType1Code
	 * TriggerType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceMovement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TriggerType1Code PriceMovement = new TriggerType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceMovement";
			owner_lazy = () -> com.tools20022.repository.codeset.TriggerType1Code.mmObject();
			codeName = TriggerTypeCode.PriceMovement.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TriggerType1Code> codesByName = new LinkedHashMap<>();

	protected TriggerType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PAEX");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TriggerType1Code";
				definition = "Defines when the trigger will hit, i.e. the action specified by the trigger instructions will come into effect.";
				trace_lazy = () -> TriggerTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TriggerType1Code.PartialExecution, com.tools20022.repository.codeset.TriggerType1Code.SpecifiedTradingSession,
						com.tools20022.repository.codeset.TriggerType1Code.NextAuction, com.tools20022.repository.codeset.TriggerType1Code.PriceMovement);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(PartialExecution.getCodeName().get(), PartialExecution);
		codesByName.put(SpecifiedTradingSession.getCodeName().get(), SpecifiedTradingSession);
		codesByName.put(NextAuction.getCodeName().get(), NextAuction);
		codesByName.put(PriceMovement.getCodeName().get(), PriceMovement);
	}

	public static TriggerType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TriggerType1Code[] values() {
		TriggerType1Code[] values = new TriggerType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TriggerType1Code> {
		@Override
		public TriggerType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TriggerType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}