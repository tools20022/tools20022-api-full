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
import com.tools20022.repository.codeset.CardPaymentServiceType2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Service provided by the card payment transaction, in addition to the main
 * service.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#Aggregation
 * CardPaymentServiceType2Code.Aggregation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#DCC
 * CardPaymentServiceType2Code.DCC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#Gratuity
 * CardPaymentServiceType2Code.Gratuity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#Instalment
 * CardPaymentServiceType2Code.Instalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#Loyalty
 * CardPaymentServiceType2Code.Loyalty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#NoShow
 * CardPaymentServiceType2Code.NoShow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#PurchaseCorporate
 * CardPaymentServiceType2Code.PurchaseCorporate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#RecurringPayment
 * CardPaymentServiceType2Code.RecurringPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#SolicitedAvailableFunds
 * CardPaymentServiceType2Code.SolicitedAvailableFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#UnsolicitedAvailableFunds
 * CardPaymentServiceType2Code.UnsolicitedAvailableFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#VoiceAuthorisation
 * CardPaymentServiceType2Code.VoiceAuthorisation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
 * CardPaymentServiceTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"AGGR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardPaymentServiceType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Service provided by the card payment transaction, in addition to the main service."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code
 * CardPaymentServiceType6Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CardPaymentServiceType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Aggregation"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code#Aggregation
	 * CardPaymentServiceType6Code.Aggregation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardPaymentServiceType2Code Aggregation = new CardPaymentServiceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Aggregation";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType6Code.Aggregation);
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType2Code.mmObject();
			codeName = CardPaymentServiceTypeCode.Aggregation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DCC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code#DCC
	 * CardPaymentServiceType6Code.DCC}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardPaymentServiceType2Code DCC = new CardPaymentServiceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DCC";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType6Code.DCC);
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType2Code.mmObject();
			codeName = CardPaymentServiceTypeCode.DCC.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gratuity"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code#Gratuity
	 * CardPaymentServiceType6Code.Gratuity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardPaymentServiceType2Code Gratuity = new CardPaymentServiceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Gratuity";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType6Code.Gratuity);
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType2Code.mmObject();
			codeName = CardPaymentServiceTypeCode.Gratuity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Instalment"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType2Code Instalment = new CardPaymentServiceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Instalment";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType2Code.mmObject();
			codeName = CardPaymentServiceTypeCode.Instalment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Loyalty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code#Loyalty
	 * CardPaymentServiceType6Code.Loyalty}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardPaymentServiceType2Code Loyalty = new CardPaymentServiceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Loyalty";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType6Code.Loyalty);
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType2Code.mmObject();
			codeName = CardPaymentServiceTypeCode.Loyalty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoShow"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code#NoShow
	 * CardPaymentServiceType6Code.NoShow}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardPaymentServiceType2Code NoShow = new CardPaymentServiceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoShow";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType6Code.NoShow);
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType2Code.mmObject();
			codeName = CardPaymentServiceTypeCode.NoShow.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseCorporate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code#PurchaseCorporate
	 * CardPaymentServiceType6Code.PurchaseCorporate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardPaymentServiceType2Code PurchaseCorporate = new CardPaymentServiceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PurchaseCorporate";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType6Code.PurchaseCorporate);
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType2Code.mmObject();
			codeName = CardPaymentServiceTypeCode.PurchaseCorporate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecurringPayment"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code#RecurringPayment
	 * CardPaymentServiceType6Code.RecurringPayment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardPaymentServiceType2Code RecurringPayment = new CardPaymentServiceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecurringPayment";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType6Code.RecurringPayment);
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType2Code.mmObject();
			codeName = CardPaymentServiceTypeCode.RecurringPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SolicitedAvailableFunds"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code#SolicitedAvailableFunds
	 * CardPaymentServiceType6Code.SolicitedAvailableFunds}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardPaymentServiceType2Code SolicitedAvailableFunds = new CardPaymentServiceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolicitedAvailableFunds";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType6Code.SolicitedAvailableFunds);
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType2Code.mmObject();
			codeName = CardPaymentServiceTypeCode.SolicitedAvailableFunds.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnsolicitedAvailableFunds"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType2Code UnsolicitedAvailableFunds = new CardPaymentServiceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnsolicitedAvailableFunds";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType2Code.mmObject();
			codeName = CardPaymentServiceTypeCode.UnsolicitedAvailableFunds.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoiceAuthorisation"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code#VoiceAuthorisation
	 * CardPaymentServiceType6Code.VoiceAuthorisation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardPaymentServiceType2Code VoiceAuthorisation = new CardPaymentServiceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoiceAuthorisation";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType6Code.VoiceAuthorisation);
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType2Code.mmObject();
			codeName = CardPaymentServiceTypeCode.VoiceAuthorisation.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CardPaymentServiceType2Code> codesByName = new LinkedHashMap<>();

	protected CardPaymentServiceType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AGGR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentServiceType2Code";
				definition = "Service provided by the card payment transaction, in addition to the main service.";
				nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType6Code.mmObject());
				trace_lazy = () -> CardPaymentServiceTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardPaymentServiceType2Code.Aggregation, com.tools20022.repository.codeset.CardPaymentServiceType2Code.DCC,
						com.tools20022.repository.codeset.CardPaymentServiceType2Code.Gratuity, com.tools20022.repository.codeset.CardPaymentServiceType2Code.Instalment,
						com.tools20022.repository.codeset.CardPaymentServiceType2Code.Loyalty, com.tools20022.repository.codeset.CardPaymentServiceType2Code.NoShow,
						com.tools20022.repository.codeset.CardPaymentServiceType2Code.PurchaseCorporate, com.tools20022.repository.codeset.CardPaymentServiceType2Code.RecurringPayment,
						com.tools20022.repository.codeset.CardPaymentServiceType2Code.SolicitedAvailableFunds, com.tools20022.repository.codeset.CardPaymentServiceType2Code.UnsolicitedAvailableFunds,
						com.tools20022.repository.codeset.CardPaymentServiceType2Code.VoiceAuthorisation);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Aggregation.getCodeName().get(), Aggregation);
		codesByName.put(DCC.getCodeName().get(), DCC);
		codesByName.put(Gratuity.getCodeName().get(), Gratuity);
		codesByName.put(Instalment.getCodeName().get(), Instalment);
		codesByName.put(Loyalty.getCodeName().get(), Loyalty);
		codesByName.put(NoShow.getCodeName().get(), NoShow);
		codesByName.put(PurchaseCorporate.getCodeName().get(), PurchaseCorporate);
		codesByName.put(RecurringPayment.getCodeName().get(), RecurringPayment);
		codesByName.put(SolicitedAvailableFunds.getCodeName().get(), SolicitedAvailableFunds);
		codesByName.put(UnsolicitedAvailableFunds.getCodeName().get(), UnsolicitedAvailableFunds);
		codesByName.put(VoiceAuthorisation.getCodeName().get(), VoiceAuthorisation);
	}

	public static CardPaymentServiceType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CardPaymentServiceType2Code[] values() {
		CardPaymentServiceType2Code[] values = new CardPaymentServiceType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CardPaymentServiceType2Code> {
		@Override
		public CardPaymentServiceType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CardPaymentServiceType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}